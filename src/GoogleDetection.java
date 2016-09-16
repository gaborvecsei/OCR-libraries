/*****************************************************
 *
 *              Vecsei Gábor
 * Email:       vecseigabor.x@gmail.com
 * Blog:        https://gaborvecsei.wordpress.com/
 * LinkedIn:    www.linkedin.com/in/vecsei-gabor
 * Github:      https://github.com/gaborvecsei
 *
 *****************************************************/

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.vision.v1.Vision;
import com.google.api.services.vision.v1.VisionRequestInitializer;
import com.google.api.services.vision.v1.model.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Gabor on 9/8/2016.
 */
public class GoogleDetection extends Detector {

    private final String CLOUD_VISION_API_KEY = "<YOUR_API_KEY>";

    @Override
    String detect(String filePath) {

        Vision vision = authToGoogleCloudVision(CLOUD_VISION_API_KEY);

        BatchAnnotateImagesRequest batchAnnotateImagesRequest = new BatchAnnotateImagesRequest();
        batchAnnotateImagesRequest.setRequests(new ArrayList<AnnotateImageRequest>() {{
            AnnotateImageRequest annotateImageRequest = new AnnotateImageRequest();

            setImage(annotateImageRequest, filePath);
            setFeaturesForOCR(annotateImageRequest);

            add(annotateImageRequest);
        }});

        Vision.Images.Annotate annotateRequest;
        BatchAnnotateImagesResponse response = null;
        try {
            annotateRequest = vision.images().annotate(batchAnnotateImagesRequest);
            // Due to a bug: requests to Vision API containing large images fail when GZipped.
            annotateRequest.setDisableGZipContent(true);

            response = annotateRequest.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return convertResultToString(response);
    }

    private byte[] getBytesFromImage(String imagePath) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedImage img = ImageIO.read(new File(imagePath));
        ImageIO.write(img, "jpg", baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();
        return imageInByte;
    }

    private void setImage(AnnotateImageRequest annotateImageRequest, String imagePath) {
        Image base64EncodedImage = new Image();
        try {
            base64EncodedImage.encodeContent(getBytesFromImage(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        annotateImageRequest.setImage(base64EncodedImage);
    }

    private void setFeaturesForLabelDetection(AnnotateImageRequest annotateImageRequest) {
        annotateImageRequest.setFeatures(new ArrayList<Feature>() {{
            Feature labelDetection = new Feature();
            labelDetection.setType("LABEL_DETECTION");
            add(labelDetection);
        }});
    }

    private void setFeaturesForOCR(AnnotateImageRequest annotateImageRequest) {
        annotateImageRequest.setFeatures(new ArrayList<Feature>() {{
            Feature textDetection = new Feature();
            textDetection.setType("TEXT_DETECTION");
            add(textDetection);
        }});
    }

    private Vision authToGoogleCloudVision(String API_KEY) {
        HttpTransport httpTransport = new NetHttpTransport();
        JsonFactory jsonFactory = GsonFactory.getDefaultInstance();

        Vision.Builder builder = new Vision.Builder(httpTransport, jsonFactory, null);
        builder.setVisionRequestInitializer(new
                VisionRequestInitializer(API_KEY));
        return builder.build();
    }

    private String convertResultToString(BatchAnnotateImagesResponse response) {

        StringBuilder sb = new StringBuilder();

        ArrayList<AnnotateImageResponse> result;
        result = (ArrayList<AnnotateImageResponse>) response.getResponses();

        for (AnnotateImageResponse r : result) {
            for (EntityAnnotation text : r.getTextAnnotations()) {
                sb.append(text.getDescription());
            }
        }
        return sb.toString();
    }

    @Deprecated
    String detectWithPythonScript(String filePath) throws IOException {
        String s = null;
        StringBuilder sb = new StringBuilder();

        Process p = Runtime.getRuntime().exec("python google_cloud_vision.py " + filePath);

        BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        while ((s = stdInput.readLine()) != null) {
            sb.append(s).append("\n");
        }

        //Error handling
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }

        return sb.toString();
    }
}

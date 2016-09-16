/*****************************************************
 *
 *              Vecsei Gábor
 * Email:       vecseigabor.x@gmail.com
 * Blog:        https://gaborvecsei.wordpress.com/
 * LinkedIn:    www.linkedin.com/in/vecsei-gabor
 * Github:      https://github.com/gaborvecsei
 *
 *****************************************************/

public class Main {

    public static void main(String[] args) {

        String docPath = "<your_file_path.pdf>";
        String imagePath = "<your_image_path.ong>";

        // Tesseract:

        TesseractDetection tess = new TesseractDetection();
        String tessDetectionDoc = tess.detect(docPath);
        String tessDetectionImage = tess.detect(imagePath);
        tess.detect(imagePath);
        System.out.print("Tesseract Image:\n\n" + tessDetectionImage);
        System.out.print("Tesseract Doc:\n\n" + tessDetectionDoc);

        // Asprise:

        AspriseDetection asp = new AspriseDetection();
        String aspriseDetectionDoc = asp.detect(docPath);
        String aspriseDetectionImage = asp.detect(imagePath);
        System.out.println("Asprise Image:\n\n" + aspriseDetectionImage);
        System.out.println("Asprise Doc:\n\n" + aspriseDetectionDoc);

        //Google:

        //Google can't do OCR on pdf, only on image files
        GoogleDetection google = new GoogleDetection();
        String googleDetection;

        //If you would like to use the python script for the detection
        /* try {
            googleDetection = google.detectWithPythonScript(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        } */

        googleDetection = google.detect(imagePath);

        System.out.println("Goole:\n\n" + googleDetection);

        System.exit(0);
    }
}

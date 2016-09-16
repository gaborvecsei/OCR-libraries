/*****************************************************
 *
 *              Vecsei Gábor
 * Email:       vecseigabor.x@gmail.com
 * Blog:        https://gaborvecsei.wordpress.com/
 * LinkedIn:    www.linkedin.com/in/vecsei-gabor
 * Github:      https://github.com/gaborvecsei
 *
 *****************************************************/

import com.asprise.ocr.Ocr;

import java.io.File;

/**
 * Created by Gabor on 9/8/2016.
 */
public class AspriseDetection extends Detector {

    @Override
    public String detect(String filePath) {
        //Set up onyl 1 time
        Ocr.setUp();

        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);

        String s = ocr.recognize(new File[]{new File(filePath)},
                Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        ocr.stopEngine();

        return s;
    }
}

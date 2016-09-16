/*****************************************************
 *
 *              Vecsei Gábor
 * Email:       vecseigabor.x@gmail.com
 * Blog:        https://gaborvecsei.wordpress.com/
 * LinkedIn:    www.linkedin.com/in/vecsei-gabor
 * Github:      https://github.com/gaborvecsei
 *
 *****************************************************/

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Created by Gabor on 9/8/2016.
 */
public class TesseractDetection extends Detector {

    @Override
    public String detect(String filePath) {
        File imageFile = new File(filePath);
        Tesseract tess = new Tesseract();

        tess.setLanguage("hun");

        try {
            String result = tess.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            return "ERROR";
        }
    }
}

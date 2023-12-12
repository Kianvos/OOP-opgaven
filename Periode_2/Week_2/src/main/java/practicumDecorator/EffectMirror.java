package practicumDecorator;

import java.awt.*;

public class EffectMirror extends ImageProcessorDecorator{

    public static final int MIRROR_HORIZONTAL = 1;
    public static final int MIRROR_VERTICAL = 2;
    public EffectMirror(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    @Override
    public Picture process() {
        Picture picture = imageProcessor.process();
        int mirror = MIRROR_HORIZONTAL;
        int width = picture.width();
        int height = picture.height();
        Picture newPicture = new Picture(width, height);
        System.out.println("WIDTH: " + width + " HEIGHT: " + height);
        if (mirror == MIRROR_HORIZONTAL) {
            int tmpValue = width - 1;
            for (int col = 0; col < width; col++) {
                for (int row = 0; row < height; row++) {
                    int rgb = picture.getRGB(col, row);
                    newPicture.setRGB(tmpValue, row, rgb);
                }
                tmpValue--;
            }
        } else if (mirror == MIRROR_VERTICAL) {
            for (int col = 0; col < width; col++) {
                int tmpValue = height - 1;
                for (int row = 0; row < height; row++) {
                    int rgb = picture.getRGB(col, row);
                    newPicture.setRGB(col, tmpValue, rgb);
                    tmpValue--;
                }
            }
        }

        return newPicture;
    }
}

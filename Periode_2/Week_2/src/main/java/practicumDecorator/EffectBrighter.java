package practicumDecorator;

import java.awt.*;

public class EffectBrighter extends ImageProcessorDecorator{
    public EffectBrighter(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    @Override
    public Picture process() {
        Picture picture = imageProcessor.process();
        int width = picture.width();
        int height = picture.height();
        Picture newPicture = new Picture(width, height);
        System.out.println("WIDTH: " + width + " HEIGHT: " + height);
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
                color = color.brighter();
                newPicture.set(col, row, color);
            }
        }
        return newPicture;
    }
}

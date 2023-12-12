package practicumDecorator;

import java.awt.*;

public class EffectRed extends ImageProcessorDecorator {

    public EffectRed(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    public Picture process() {
        Picture picture = imageProcessor.process();
        int width = picture.width();
        int height = picture.height();
        Picture newPicture = new Picture(width, height);
        System.out.println("WIDTH: " + width + " HEIGHT: " + height);
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int rgb = picture.getRGB(col, row);
                int red = (rgb >> 16) & 0xFF;
                int green = (rgb >> 8) & 0xFF;
                int blue = rgb & 0xFF;
                red = (red + green + blue) / 3; // gemiddelde intensiteit toekennen aan rood
                green = 0; // geen groen
                blue = 0; // geen blauw

                newPicture.setRGB(col, row, new Color(red, green, blue).getRGB());
            }
        }
        return newPicture;
    }
}

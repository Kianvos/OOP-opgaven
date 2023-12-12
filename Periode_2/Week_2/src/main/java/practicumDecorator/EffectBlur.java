package practicumDecorator;

import java.awt.*;

public class EffectBlur extends ImageProcessorDecorator{

    public EffectBlur(ImageProcessor imageProcessor) {
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
                if (col < 1 || row < 1 || col + 1 == width || row + 1 == height) {
                    continue;
                }
                int[] pixelRGB = new int[9];
                pixelRGB[0] = picture.getRGB(col - 1, row - 1);
                pixelRGB[1] = picture.getRGB(col, row - 1);
                pixelRGB[2] = picture.getRGB(col + 1, row - 1);
                pixelRGB[3] = picture.getRGB(col - 1, row);
                pixelRGB[4] = picture.getRGB(col, row);
                pixelRGB[5] = picture.getRGB(col + 1, row);
                pixelRGB[6] = picture.getRGB(col - 1, row + 1);
                pixelRGB[7] = picture.getRGB(col, row + 1);
                pixelRGB[8] = picture.getRGB(col + 1, row + 1);


                int avgRed = getAvgRed(pixelRGB);
                int avgGreen = getAvgGreen(pixelRGB);
                int avgBlue = getAvgBlue(pixelRGB);
                newPicture.setRGB(col, row, new Color(avgRed, avgGreen, avgBlue).getRGB());
            }
        }
        return newPicture;
    }

    public int getAvgRed(int[] pixelRGB){
        int red = 0;
        for (int i = 0; i < pixelRGB.length; i++) {
            red += (pixelRGB[i] >> 16) & 0xFF;
        }
        return red/pixelRGB.length;
    }

    public int getAvgGreen(int[] pixelRGB){
        int green = 0;
        for (int i = 0; i < pixelRGB.length; i++) {
            green += (pixelRGB[i] >> 8) & 0xFF;
        }
        return green/pixelRGB.length;
    }

    public int getAvgBlue(int[] pixelRGB){
        int blue = 0;
        for (int i = 0; i < pixelRGB.length; i++) {
            blue += pixelRGB[i] & 0xFF;
        }
        return blue/pixelRGB.length;
    }
}

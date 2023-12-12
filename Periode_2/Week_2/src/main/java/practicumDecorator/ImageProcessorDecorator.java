package practicumDecorator;

abstract public class ImageProcessorDecorator implements ImageProcessor {
    ImageProcessor imageProcessor;

    public ImageProcessorDecorator(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }
}

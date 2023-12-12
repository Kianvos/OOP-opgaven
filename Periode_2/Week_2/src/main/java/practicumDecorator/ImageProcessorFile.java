package practicumDecorator;

public class ImageProcessorFile implements ImageProcessor{
    private Picture picture;

    public ImageProcessorFile(String filename) {
        String pwd = "/Users/kianvos/Library/CloudStorage/OneDrive-HanzehogeschoolGroningen/Jaar_2/Periode_2/Object_georienteerd/Week_2/src/main/java/practicumDecorator/";
        this.picture = new Picture(pwd + filename);
    }

    @Override
    public Picture process() {
        return picture;
    }
}

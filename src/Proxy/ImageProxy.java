package Proxy;

public class ImageProxy implements Image {
    private Image image;
    private String fileName;
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
                image = new PhotoImage(fileName);
            } else if (fileName.endsWith(".svg")) {
                image = new DrawingImage(fileName);
            } else {
                image = new RealImage(fileName);
            }
        }
        image.display();
    }
}

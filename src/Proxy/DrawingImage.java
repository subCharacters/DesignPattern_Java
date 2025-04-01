package Proxy;

public class DrawingImage implements Image {
    private String filename;

    public DrawingImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // 실제 로딩이 있다는 전제.
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        System.out.println("Drawing Displaying " + filename);
    }
}

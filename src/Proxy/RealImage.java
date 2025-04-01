package Proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // 실제 로딩이 있다는 전제.
    }

    private void loadFromDisk() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Real Displaying " + filename);
    }
}

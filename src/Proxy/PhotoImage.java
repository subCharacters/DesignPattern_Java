package Proxy;

public class PhotoImage implements Image {
    private String filename;

    public PhotoImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // 실제 로딩이 있다는 전제.
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        System.out.println("Photo Displaying " + filename);
    }
}

package proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading file ....");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loaded");
    }

    @Override
    public void display() {
        System.out.println("File: " + fileName);
        System.out.println("This is big nice picture of cat");
    }
}

package proxy;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisck();
    }

    private void loadFromDisck() {
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
        loadFromDisck();
        System.out.println("File: "+fileName);
        System.out.println("this is big nice picture of cat");
    }
}
//github.com/SzestKam/SDA11_DesignPatterns
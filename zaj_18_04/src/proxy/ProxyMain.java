package proxy;

public class ProxyMain {
    public static void main(String[] args) {

        Image realImg = new RealImage("cat photo.jpg");
        Image proxyImg = new ProxyImage("cat photo.jpg");

        for (int i = 0; i < 3; i++) {
            realImg.display();
        }
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            proxyImg.display();
        }

    }
}

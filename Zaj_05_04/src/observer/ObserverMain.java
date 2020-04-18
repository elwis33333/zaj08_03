package observer;

public class ObserverMain {
    public static void main(String[] args) {
DecimalSubject subject =new DecimalSubject();
        new BinObserver(subject);
        new OctObserver(subject);
        new HexObserver(subject);

subject.setDecimalValue(10);
        System.out.println("---");
        subject.setDecimalValue(26);
        System.out.println("---");
        subject.setDecimalValue(30);
        System.out.println("---");


    }
}

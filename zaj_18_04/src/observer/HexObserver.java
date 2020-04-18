package observer;

public class HexObserver implements Observer {
    private Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        int val10 = subject.get();
        String val16 = Integer.toHexString(val10);
        System.out.println(val16);
    }
}

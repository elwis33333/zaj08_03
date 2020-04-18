package observer;

public class BinObserver implements Observer {
    private Subject subject;
    public BinObserver(Subject subject){
        this.subject=subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        int val10 = subject.get();
        String val16 = Integer.toBinaryString(val10);
        System.out.println(val16);
    }

}

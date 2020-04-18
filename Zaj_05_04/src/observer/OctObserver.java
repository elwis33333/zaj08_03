package observer;

public class OctObserver implements Observer {
    private Subject subject;
    public OctObserver(Subject subject){
        this.subject=subject;
        subject.addObserver(this);
    }

        @Override
        public void update() {
            int val10 = subject.get();
            String val16 = Integer.toOctalString(val10);
            System.out.println(val16);
    }
}

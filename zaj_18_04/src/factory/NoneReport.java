package factory;

public class NoneReport implements Report {

    @Override
    public void print() {
        System.out.println("Not supported");
    }
}

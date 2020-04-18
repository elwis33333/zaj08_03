package singleton;

public class SingletonObjectEager {

    private static final SingletonObjectEager INSTANCE = new SingletonObjectEager();

    private SingletonObjectEager() {

    }

    public static SingletonObjectEager getInstance() {
        return INSTANCE;
    }
    public void calculate(){
        System.out.println(this.getClass().getSimpleName());
    }
}

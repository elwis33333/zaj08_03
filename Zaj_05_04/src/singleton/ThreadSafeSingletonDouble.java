package singleton;

public class ThreadSafeSingletonDouble {

    private static ThreadSafeSingletonDouble INSTANCE ;

    private ThreadSafeSingletonDouble() {

    }

    public static ThreadSafeSingletonDouble getInstance() {
        if(INSTANCE == null) {
            synchronized (ThreadSafeSingletonDouble.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingletonDouble();
                }
            }
        }
        return INSTANCE;
    }
    public void calculate(){
        System.out.println(this.getClass().getSimpleName());
    }
}

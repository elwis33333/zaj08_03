package singleton;

public class ThreadSafeSingletonDouble {
    private static ThreadSafeSingletonDouble instance;
    private final static Object lock = new Object(); //semafor

    private ThreadSafeSingletonDouble() {
    }

    public static ThreadSafeSingletonDouble getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonDouble();
                }
            }
        }
        return instance;
    }

    public void calculate() {
        System.out.println(this.getClass().getSimpleName());
    }
}
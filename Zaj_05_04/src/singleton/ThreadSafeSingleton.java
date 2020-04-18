package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE ;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
    public void calculate(){
        System.out.println(this.getClass().getSimpleName());
    }
}

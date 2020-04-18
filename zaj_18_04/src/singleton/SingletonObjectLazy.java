package singleton;

public class SingletonObjectLazy {

    private static SingletonObjectLazy mySingleton;

    private SingletonObjectLazy() {
    }

    public static SingletonObjectLazy getInstance() {
        if (mySingleton == null) {
            mySingleton = new SingletonObjectLazy();
            System.out.println("Sekcja tworzenia");
        }
        return mySingleton;
    }

    public void calculate() {
        System.out.println(this.getClass().getSimpleName());
    }
}

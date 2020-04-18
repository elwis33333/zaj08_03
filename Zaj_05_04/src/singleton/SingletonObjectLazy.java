package singleton;

public class SingletonObjectLazy {

    private static SingletonObjectLazy INSTANCE ;

    private SingletonObjectLazy() {

    }

    public static SingletonObjectLazy getInstance() {
        if(INSTANCE == null){
            INSTANCE = new SingletonObjectLazy();
            System.out.println("Sekcja tworenia obiektu");
        }
        return INSTANCE;
    }
    public void calculate(){
        System.out.println(this.getClass().getSimpleName());
    }
}

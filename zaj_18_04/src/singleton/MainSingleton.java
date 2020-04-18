package singleton;

import java.time.LocalTime;

public class MainSingleton {

    public static void main(String[] args) {
        SingletonObjectEager se = SingletonObjectEager.getInstance();
        se.calculate();

        SingletonObjectLazy sl1 = SingletonObjectLazy.getInstance();
        sl1.calculate();

        SingletonObjectLazy sl2 = SingletonObjectLazy.getInstance();
        sl2.calculate();

        SingletonEnum senum = SingletonEnum.GET_INSTANCE;
        senum.calculate();

        LocalTime start = LocalTime.now();
        for (int i = 0; i < 1_000; i++) {
            new Thread(() -> {
                ThreadSafeSingleton.getInstance().calculate();
            }).start();
        }
        LocalTime end = LocalTime.now();
        double val1 =(end.getNano() - start.getNano())/1_000_000_000.0;


        start = LocalTime.now();
        for (int i = 0; i < 1_000; i++) {
            new Thread(() -> {
                ThreadSafeSingletonDouble.getInstanceUsingDoubleLocking().calculate();
            }).start();
        }
        end = LocalTime.now();


        System.out.println( val1 + " s  T1");
        System.out.println((end.getNano() - start.getNano())/1_000_000_000.0 + " s  T2");

    }
}

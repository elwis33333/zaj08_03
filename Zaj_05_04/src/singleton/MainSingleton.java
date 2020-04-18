package singleton;

import java.time.LocalTime;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonObjectEager so = SingletonObjectEager.getInstance();
        so.calculate();
        SingletonObjectLazy sl1 = SingletonObjectLazy.getInstance();
        SingletonObjectLazy sl2 = SingletonObjectLazy.getInstance();
        sl1.calculate();
        sl2.calculate();
        System.out.println(sl1 == sl2);
        SingletonEnum senum = SingletonEnum.GET_INSTANCE;
        senum.calculate();
        LocalTime start = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            new Thread(()-> {ThreadSafeSingleton.getInstance().calculate();}).start();
        }
        LocalTime end = LocalTime.now();

        LocalTime start1 = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            new Thread(()-> {ThreadSafeSingletonDouble.getInstance().calculate();}).start();
        }
        LocalTime end1 = LocalTime.now();
        System.out.println("Utworzenie 1000 ThreadSafeSingleton twrało: "+(end.getNano() -start.getNano())/1_000_000_000.0 + " s");

        System.out.println("Utworzenie 1000 ThreadSafeSingleton twrało: "+(end1.getNano() -start1.getNano())/1_000_000_000.0 + " s");



    }
}

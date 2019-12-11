package com.sap.mervyn.designpattern.singleton;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

}

class LazySingleton {

    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }

}

class StaticClassSingleton {

    private StaticClassSingleton() {}

    static class Instance {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return Instance.INSTANCE;
    }

}

class EnumSingletonSample {

    private EnumSingletonSample() {}

    private enum EnumSingleton {
        INSTANCE;
    }

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}

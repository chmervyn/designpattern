package com.sap.mervyn.designpattern.factory;

public class SimpleHumanFactory  {

    public static <T extends Human> T createHuman(Class<T> c) {
        T human = null;

        try {
            human = c.newInstance();
        } catch (Exception e) {
            System.err.println("人种生成错误！");
        }

        return human;
    }
}

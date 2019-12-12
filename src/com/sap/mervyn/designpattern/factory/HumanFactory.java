package com.sap.mervyn.designpattern.factory;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T human = null;

        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.err.println("人种生成错误！");
        }

        return human;
    }
}

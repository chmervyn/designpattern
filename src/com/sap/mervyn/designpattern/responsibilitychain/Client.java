package com.sap.mervyn.designpattern.responsibilitychain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Random rnd = new Random();
        List<IWoman> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Woman(rnd.nextInt(4), "我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        list.stream().forEach(woman -> father.handlerMessage(woman));
    }

}

package com.sap.mervyn.designpattern.factory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Black human...");
    }

    @Override
    public void say() {
        System.out.println("I am black human...");
    }
}

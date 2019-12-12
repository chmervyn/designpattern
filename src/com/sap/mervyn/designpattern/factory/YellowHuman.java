package com.sap.mervyn.designpattern.factory;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Yellow human...");
    }

    @Override
    public void say() {
        System.out.println("I am yellow human...");
    }
}

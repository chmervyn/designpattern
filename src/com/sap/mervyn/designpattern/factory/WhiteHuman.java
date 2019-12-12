package com.sap.mervyn.designpattern.factory;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("White human...");
    }

    @Override
    public void say() {
        System.out.println("I am white human...");
    }
}

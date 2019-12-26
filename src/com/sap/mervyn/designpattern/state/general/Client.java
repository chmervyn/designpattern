package com.sap.mervyn.designpattern.state.general;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());

        context.handle1();
        context.handle2();
    }

}

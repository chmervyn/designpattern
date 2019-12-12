package com.sap.mervyn.designpattern.templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractClass clazz1 = new ConcreteClass1();
        AbstractClass clazz2 = new ConcreteClass2();

        clazz1.templateMethod();
        clazz2.templateMethod();
    }

}

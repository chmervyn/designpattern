package com.sap.mervyn.designpattern.visitor.general;

import java.util.Random;

public class ObjectStructure {

    public static Element createElement() {
        Random rnd = new Random();

        if (rnd.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }

}

package com.sap.mervyn.designpattern.visitor.general;

public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element el = ObjectStructure.createElement();
            el.accept(new Visitor());
        }
    }

}

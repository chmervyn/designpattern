package com.sap.mervyn.designpattern.observer.general;

public class ConcreteSubject extends Subject {

    public void doSomething() {
        /*
        do something
         */

        super.notifyObservers();
    }

}

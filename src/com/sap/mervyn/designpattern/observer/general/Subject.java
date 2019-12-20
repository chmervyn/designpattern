package com.sap.mervyn.designpattern.observer.general;

import java.util.Vector;

public abstract class Subject {

    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver(Observer observer) {
        this.obsVector.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.obsVector.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : obsVector) {
            o.update();
        }
    }

}

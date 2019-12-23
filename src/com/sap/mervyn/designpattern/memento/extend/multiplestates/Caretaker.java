package com.sap.mervyn.designpattern.memento.extend.multiplestates;

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

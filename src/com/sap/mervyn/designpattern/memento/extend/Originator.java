package com.sap.mervyn.designpattern.memento.extend;

public class Originator implements Cloneable {

    private Originator backup;

    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup = this.clone();
    }

    public void restoreMemento() {
        this.setState(backup.getState());
    }

    @Override
    public Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }

}

package com.sap.mervyn.designpattern.iterator.general;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
    private final Vector<String> vector = new Vector<>();

    @Override
    public void add(String object) {
        this.vector.add(object);
    }

    @Override
    public void remove(String object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}

package com.sap.mervyn.designpattern.iterator.general;

import java.util.Vector;

public class ConcreteIterator<E> implements Iterator<E> {
    private final Vector<E> vector;
    private int cursor = 0;

    public ConcreteIterator(Vector<E> vector) {
        this.vector = vector;
    }

    @Override
    public E next() {
        return this.vector.get(this.cursor++);
    }

    @Override
    public boolean hasNext() {
        return !(this.cursor == this.vector.size());
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor--);
        return true;
    }
}

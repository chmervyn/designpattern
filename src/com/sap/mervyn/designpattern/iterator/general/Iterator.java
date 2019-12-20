package com.sap.mervyn.designpattern.iterator.general;

public interface Iterator<E> {

    E next();

    boolean hasNext();

    boolean remove();

}

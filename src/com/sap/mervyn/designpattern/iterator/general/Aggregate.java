package com.sap.mervyn.designpattern.iterator.general;

public interface Aggregate {

    void add(String object);

    void remove(String object);

    Iterator iterator();

}

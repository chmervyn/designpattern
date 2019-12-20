package com.sap.mervyn.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {

    private final List<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinate() {
        return this.subordinateList;
    }
}

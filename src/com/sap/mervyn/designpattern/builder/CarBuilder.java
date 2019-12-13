package com.sap.mervyn.designpattern.builder;

import java.util.List;

public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();

}

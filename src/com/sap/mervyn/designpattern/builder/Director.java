package com.sap.mervyn.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private final List<String> sequence = new ArrayList<>();
    private final BenzBuilder benzBuilder = new BenzBuilder();
    private final BMWBuilder bmwBuilder = new BMWBuilder();

    public CarModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }

    public CarModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }
}

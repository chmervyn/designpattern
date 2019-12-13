package com.sap.mervyn.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        benz.run();

        System.out.println("#######################");

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmw = bmwBuilder.getCarModel();
        bmw.run();


        System.out.println("--------------------------------");
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("##############");

        director.getBBenzModel().run();
        System.out.println("##############");

        director.getCBMWModel().run();
        System.out.println("##############");

        director.getDBMWModel().run();

    }


}

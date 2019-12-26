package com.sap.mervyn.designpattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static Map<String, FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyWeight(String extrinsic) {
        FlyWeight flyWeight;

        if (pool.containsKey(extrinsic)) {
            flyWeight = pool.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight1(extrinsic);
            pool.put(extrinsic, flyWeight);
        }

        return flyWeight;
    }
}

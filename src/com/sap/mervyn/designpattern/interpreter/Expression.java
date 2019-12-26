package com.sap.mervyn.designpattern.interpreter;

import java.util.Map;

public abstract class Expression {

    public abstract int interpreter(Map<String, Integer> var);

}

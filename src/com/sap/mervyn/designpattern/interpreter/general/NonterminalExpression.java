package com.sap.mervyn.designpattern.interpreter.general;

public class NonterminalExpression extends Expression {

    public NonterminalExpression(Expression... expressions) {

    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}

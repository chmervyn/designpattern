package com.sap.mervyn.designpattern.decorator.general;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do something");
    }
}

package com.sap.mervyn.designpattern.decorator.general;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void method2() {
        System.out.println("method2 修饰");
    }

    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}

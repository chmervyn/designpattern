package com.sap.mervyn.designpattern.decorator.general;

public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}

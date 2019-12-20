package com.sap.mervyn.designpattern.composite.general.transparent;

import java.util.List;

public abstract class Component {

    public void doSomething() {}

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> getChildren();
}

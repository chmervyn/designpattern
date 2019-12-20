package com.sap.mervyn.designpattern.composite.general.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getChildren() {
        return componentList;
    }
}

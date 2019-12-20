package com.sap.mervyn.designpattern.composite.general.transparent;

import java.util.List;

public class Leaf extends Component {


    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}


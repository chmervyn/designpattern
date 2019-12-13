package com.sap.mervyn.designpattern.prototype.lowdeepcopy;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyThing implements Cloneable {
    private List<String> list = new ArrayList<>();

    @Override
    public DeepCopyThing clone() {
        DeepCopyThing copied = null;

        try {
            copied = (DeepCopyThing) super.clone();
            copied.list = (List<String>) ((ArrayList<String>) this.list).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copied;
    }

    public void setValue(String value) {
        list.add(value);
    }

    public List<String> getValues() {
        return list;
    }
}

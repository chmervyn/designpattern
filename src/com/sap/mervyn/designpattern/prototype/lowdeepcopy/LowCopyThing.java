package com.sap.mervyn.designpattern.prototype.lowdeepcopy;

import java.util.ArrayList;
import java.util.List;

public class LowCopyThing implements Cloneable {
    private List<String> list = new ArrayList<String>();

    @Override
    public LowCopyThing clone() {
        LowCopyThing copied = null;

        try {
            copied = (LowCopyThing) super.clone();
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

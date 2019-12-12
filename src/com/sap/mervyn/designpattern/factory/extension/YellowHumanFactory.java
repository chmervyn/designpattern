package com.sap.mervyn.designpattern.factory.extension;

import com.sap.mervyn.designpattern.factory.Human;
import com.sap.mervyn.designpattern.factory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}

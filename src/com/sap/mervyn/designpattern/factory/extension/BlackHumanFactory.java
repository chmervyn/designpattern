package com.sap.mervyn.designpattern.factory.extension;

import com.sap.mervyn.designpattern.factory.BlackHuman;
import com.sap.mervyn.designpattern.factory.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}

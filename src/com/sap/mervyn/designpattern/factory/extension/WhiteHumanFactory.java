package com.sap.mervyn.designpattern.factory.extension;

import com.sap.mervyn.designpattern.factory.Human;
import com.sap.mervyn.designpattern.factory.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}

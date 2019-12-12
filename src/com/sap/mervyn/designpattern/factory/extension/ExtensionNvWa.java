package com.sap.mervyn.designpattern.factory.extension;

import com.sap.mervyn.designpattern.factory.*;

public class ExtensionNvWa {

    public static void main(String[] args) {
        // simple factory
        Human person = new BlackHumanFactory().createHuman();
        person.getColor();
        person.say();

        person = new WhiteHumanFactory().createHuman();
        person.getColor();
        person.say();

        person = new YellowHumanFactory().createHuman();
        person.getColor();
        person.say();
    }

}

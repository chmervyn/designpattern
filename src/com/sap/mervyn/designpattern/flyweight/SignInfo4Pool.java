package com.sap.mervyn.designpattern.flyweight;

public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getkey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}

package com.sap.mervyn.designpattern.adapter;

import java.util.Map;

public interface IOuterUser {

    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserHomeInfo();

    Map<String, String> getUserOfficeInfo();
}

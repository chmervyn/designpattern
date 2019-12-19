package com.sap.mervyn.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王。。。");
        baseInfoMap.put("mobileNumber", "这个员工的电话是。。。");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put("homeTelNumber", "员工的家庭电话是。。。");
        homeInfoMap.put("homeAddress", "员工的家庭地址是。。。");
        return homeInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfoMap = new HashMap<>();
        officeInfoMap.put("jobPosition", "这个人的职位是BOSS。。。");
        officeInfoMap.put("officeTelNumber", "员工的办公室电话是。。。");
        return officeInfoMap;
    }
}

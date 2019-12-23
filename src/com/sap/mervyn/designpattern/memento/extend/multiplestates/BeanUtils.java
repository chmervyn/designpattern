package com.sap.mervyn.designpattern.memento.extend.multiplestates;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

    private BeanUtils() {}

    public static Map<String, Object> backupProp(Originator originator) {
        Map<String, Object> result = new HashMap<>();

        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors) {
                String fieldName = descriptor.getName();
                if (!"class".equalsIgnoreCase(fieldName)) {
                    Method getter = descriptor.getReadMethod();
                    Object fieldValue = getter.invoke(originator, new Object[]{});
                    result.put(fieldName, fieldValue);
                }


            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void restoreProp(Originator originator, Map<String, Object> stateMap) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors) {
                String fieldName = descriptor.getName();
                if (stateMap.containsKey(fieldName)) {
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(originator, new Object[]{stateMap.get(fieldName)});
                }


            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

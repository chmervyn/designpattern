package com.sap.mervyn.designpattern.memento.extend.multiplestates;

import java.util.Map;

public class Memento {
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return this.stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}

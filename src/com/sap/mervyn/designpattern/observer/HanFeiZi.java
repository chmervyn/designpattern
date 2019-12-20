package com.sap.mervyn.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable, IHanFeiZi {
    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void haveBreakFast() {
        System.out.println("韩非子：开始吃饭了。。。");
        notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");
        notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }
}

package com.alek.designpattern.observer;

public interface Subject {

    void notifyObservers();
    void register(Observer observer);
    void unregister(Observer observer);

}

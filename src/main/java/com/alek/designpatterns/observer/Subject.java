package com.alek.designpatterns.observer;

public interface Subject {

    void notifyObservers();
    void register(Observer observer);
    void unregister(Observer observer);

}

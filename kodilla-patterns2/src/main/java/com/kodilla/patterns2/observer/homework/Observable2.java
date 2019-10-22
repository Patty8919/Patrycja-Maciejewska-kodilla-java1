package com.kodilla.patterns2.observer.homework;

public interface Observable2 {
    void registerObserver(Observer2 observer2);
    void notifyObservers();
    void removeObserver(Observer2 observer2);
}

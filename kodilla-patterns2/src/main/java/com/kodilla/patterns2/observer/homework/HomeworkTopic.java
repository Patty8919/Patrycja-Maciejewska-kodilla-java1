package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTopic implements Observable2 {
    private final List<Observer2> observers2;
    private final List<String> messages;
    private final String name;

    public HomeworkTopic(String name) {
        messages = new ArrayList<>();
        observers2 = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer2 observer) {
        observers2.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer2 observer : observers2) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer2 observer) {
        observers2.remove(observer);
    }


    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}

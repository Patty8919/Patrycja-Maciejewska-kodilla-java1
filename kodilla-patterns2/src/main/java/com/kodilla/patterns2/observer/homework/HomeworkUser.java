package com.kodilla.patterns2.observer.homework;

public class HomeworkUser implements Observer2 {
    private final String username;
    private int updateCount;

    public HomeworkUser(String username) {
        this.username = username;
        this.updateCount = 0;
    }

    @Override
    public void update(HomeworkTopic homeworkTopic) {
        System.out.println(username + ": New homework " + homeworkTopic.getName() + "\n" +
                " (total: " + homeworkTopic.getMessages().size() + " homework)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}

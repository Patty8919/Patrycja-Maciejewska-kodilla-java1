package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final int quantity;
    boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "Buy " + quantity + whatToBuy;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}

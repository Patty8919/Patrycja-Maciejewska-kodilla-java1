package com.kodilla.patterns.factory.tasks;

final public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "Drive" + where + using;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}

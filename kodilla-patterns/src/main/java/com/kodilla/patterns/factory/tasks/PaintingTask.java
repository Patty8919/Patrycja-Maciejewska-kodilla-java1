package com.kodilla.patterns.factory.tasks;

final public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "Paint" + color + whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}

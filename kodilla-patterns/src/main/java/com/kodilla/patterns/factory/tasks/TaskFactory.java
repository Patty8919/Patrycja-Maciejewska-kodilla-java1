package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy "," bottles of water", 12);
            case PAINTING:
                return new PaintingTask("Paint ", " blue ", "walls");
            case DRIVING:
                return new DrivingTask("Drive "," for summer ","by car");
            default:
                return null;
        }
    }
}

package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy ",shoppingTask.getTaskName());
        Assert.assertEquals("Buy 12 bottles of water", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());

    }
    @Test
    public void testPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint ",paintingTask.getTaskName());
        Assert.assertEquals("Paint blue walls", paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    public void testDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Drive ",drivingTask.getTaskName());
        Assert.assertEquals("Drive for summer by car", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());


    }
}

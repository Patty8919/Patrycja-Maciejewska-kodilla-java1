package com.kodilla.spring.forum;

import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a circle", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a triangle", result);
    }
}

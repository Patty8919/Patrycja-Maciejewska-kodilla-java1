package com.kodilla.testing.shape;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){

        //Given
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigureWhichDoesNotExist(){

        //Given
        shapeCollector.addFigure(new Square(5));
        //When
        boolean result = shapeCollector.removeFigure(new Square(4));
        //Then
        assertFalse(result);
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testGetFigureExistNumber(){

        //Given
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, shapeResult);
    }

    @Test
    public void testGetFigureNumberOutOfRange(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertNull(shapeResult);
    }
    @Test
    public void testShowFigures(){

        /* Given */
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);

        //When
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);
        //List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        String showFiguresResult = shapeCollector.showFigures();


        //Then
        assertEquals(shapeList.toString(), showFiguresResult);
    }
}


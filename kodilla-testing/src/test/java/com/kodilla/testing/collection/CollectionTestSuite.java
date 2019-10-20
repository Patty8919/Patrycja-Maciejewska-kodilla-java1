package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    private static OddNumbersExterminator oddNumbersExterminator;
    @Before
    public void before() {

        System.out.println("Test Case: begin");
    }
    @After
    public void after() {

        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        oddNumbersExterminator = new OddNumbersExterminator();
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> emptyList = new ArrayList<>();

        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Empty list");

        Assert.assertEquals(emptyList, resultList);


    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        ArrayList<Integer>expectedresultList = new ArrayList<>();
        expectedresultList.add(2);
        expectedresultList.add(4);
        expectedresultList.add(6);

        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");

        Assert.assertEquals(expectedresultList, resultList);

    }
}

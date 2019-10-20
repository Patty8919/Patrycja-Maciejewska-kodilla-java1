package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers [] = {1,2,3,4,7,8,5,9,6,7,5,2,1,4,7,3,4,3};
        double averageExpected = 4.5;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}

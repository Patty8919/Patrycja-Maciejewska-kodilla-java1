package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    List<Integer> exterminate (ArrayList<Integer>numbers) {
        List<Integer> getNumbers = new ArrayList <>();

        for (int number: numbers) {
            if (number%2 == 0) {
                getNumbers.add(number);
            }
        }
        return getNumbers;
    }

}

package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Potop", "Henryk Sienkiewicz", 1950, "S01"));
        bookSet.add(new Book("Harry Potter", "J.K.Rowling", 2000, "S02"));
        bookSet.add(new Book("Pan Tadeusz", "Adam Mickiewicz", 1853, "S03"));
        bookSet.add(new Book("To", "Stephen King", 2018, "S11"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(2000, publicationYearMedian);
    }
}

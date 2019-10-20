package com.kodilla.patterns.prototype.library;

import org.junit.Test;
import org.junit.Assert;
import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("");
        Set<Book> theList = library.getBooks();

        Book book1 = new Book("Lalka","Boleslaw Prus", LocalDate.of(1880,02,10));
        Book book2 = new Book("Potop","Henryk Sienkiewicz", LocalDate.of(1886,04,20));
        Book book3 = new Book("Przygody Tomka Sawyera","Mark Twain", LocalDate.of(1876,10,15));
        Book book4 = new Book("Harry Potter","J.K.Rowling", LocalDate.of(1997,05,02));
        Book book5 = new Book("To","Stephen King", LocalDate.of(1986,10,10));

        theList.add(book1);
        theList.add(book2);
        theList.add(book3);
        theList.add(book4);
        theList.add(book5);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(theList);
        System.out.println(clonedLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(4, theList.size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepCloneLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(),library.getBooks());
    }
}

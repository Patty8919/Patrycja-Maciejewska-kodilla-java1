package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;
    final private Set<Book> books = new HashSet<>();

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "\n"+"Book " + title + " " + author + " " + publicationDate;
    }
}

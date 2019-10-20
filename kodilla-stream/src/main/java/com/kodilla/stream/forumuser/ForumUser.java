package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String firstname;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int publicPosts;

    public ForumUser(int id, String firstname, char sex, LocalDate birthdayDate, int publicPosts) {
        this.id = id;
        this.firstname = firstname;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.publicPosts = publicPosts;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPublicPosts() {
        return publicPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id = " + id +
                ", firstname = '" + firstname + '\'' +
                ", sex = " + sex +
                ", birthdayDate = " + birthdayDate +
                ", publicPosts = " + publicPosts +
                '}';
    }
}

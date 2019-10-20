package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Anna", 'F', LocalDate.of(2002, Month.DECEMBER, 2),10));
        forumUserList.add(new ForumUser(2, "Katarzyna", 'F', LocalDate.of(1997, Month.NOVEMBER, 10),0));
        forumUserList.add(new ForumUser(3, "Tomasz", 'M', LocalDate.of(2007, Month.NOVEMBER, 5),5));
        forumUserList.add(new ForumUser(4, "Zuzia", 'F', LocalDate.of(1960, Month.APRIL, 7),2));
        forumUserList.add(new ForumUser(5, "Klara", 'F', LocalDate.of(1974, Month.NOVEMBER, 28),7));
        forumUserList.add(new ForumUser(6, "Robert", 'M', LocalDate.of(2000, Month.SEPTEMBER, 4),0));
        forumUserList.add(new ForumUser(7, "Zofia", 'F', LocalDate.of(1998, Month.MAY, 30),0));
        forumUserList.add(new ForumUser(8, "Piotr", 'M', LocalDate.of(1970, Month.JULY, 15),3));
        forumUserList.add(new ForumUser(9, "Amelia", 'F', LocalDate.of(1985, Month.SEPTEMBER, 14),4));
        forumUserList.add(new ForumUser(10, "Monika", 'F', LocalDate.of(2005, Month.JUNE, 9),8));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}

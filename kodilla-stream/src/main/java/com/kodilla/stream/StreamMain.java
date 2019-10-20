package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.Period.between;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUser = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPublicPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        mapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);


        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText = poemBeautifier.beautify("Text to beauty", text -> text.toUpperCase());
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Text to beauty", text ->"ABC " + text+" ABC");
        System.out.println(beautifulText2);
        
        String beautifulText3 = poemBeautifier.beautify("Text to beauty", text -> text.toLowerCase());
        System.out.println(beautifulText3);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0, s.indexOf(' ')+2)+".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

    }
}
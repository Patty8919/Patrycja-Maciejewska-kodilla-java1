package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate () {
        HomeworkTopic topic1 = new HomeworkTopic("Topic 1");
        HomeworkTopic topic2 = new HomeworkTopic("Topic 2");
        HomeworkTopic topic3 = new HomeworkTopic("Topic 3");
        HomeworkUser user1 = new HomeworkUser("John Smith");
        HomeworkUser user2 = new HomeworkUser("Ivone Escobar");
        HomeworkUser user3 = new HomeworkUser("Jessie Pinkman");
        topic1.registerObserver(user1);
        topic2.registerObserver(user2);
        topic3.registerObserver(user3);
        //When
        topic1.addPost("Post 1");
        topic1.addPost("Post 2");
        topic2.addPost("Post 1");
        topic2.addPost("Post 2");
        topic2.addPost("Post 3");
        topic3.addPost("Post 1");
        //Then
        assertEquals(2, user1.getUpdateCount());
        assertEquals(3, user2.getUpdateCount());
        assertEquals(1, user3.getUpdateCount());

    }
}

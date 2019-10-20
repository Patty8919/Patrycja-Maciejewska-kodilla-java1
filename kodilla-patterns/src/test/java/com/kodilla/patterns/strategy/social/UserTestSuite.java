package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kate = new Millenials("Kate Smith");
        User tom = new YGeneration("Tom Link");
        User steven = new ZGeneration("Steven O");
        //When
        String kateSharePost = kate.predict();
        String tomSharePost = tom.predict();
        String stevenSharePost = steven.predict();

        //Then
        Assert.assertEquals("[Snapchat Publisher] ===> Millenials", kateSharePost);
        Assert.assertEquals("[Facebook Publisher] ===> YGeneration", tomSharePost);
        Assert.assertEquals("[Twitter Publisher] ===> ZGeneration", stevenSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User tom = new ZGeneration("Tom Link");
        //When
        String tomSharePost = tom.predict();
        tom.sharePost(new TwitterPublisher());
        tomSharePost = tom.predict();

        //Then
        Assert.assertEquals("[Twitter Publisher] ===> ZGeneration",tomSharePost);
    }
}

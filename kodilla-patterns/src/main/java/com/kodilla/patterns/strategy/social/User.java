package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialMedia socialMedia;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return socialMedia.predictWhatToUse();
    }

    public void sharePost(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }
}

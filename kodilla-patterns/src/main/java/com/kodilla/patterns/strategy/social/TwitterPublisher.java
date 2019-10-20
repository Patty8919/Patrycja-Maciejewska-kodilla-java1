package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialMedia {
    @Override
    public String predictWhatToUse() {
        return "[Twitter Publisher] ===> ZGeneration";
    }
}

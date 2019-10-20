package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialMedia {
    @Override
    public String predictWhatToUse() {
        return "[Snapchat Publisher] ===> Millenials";
    }
}

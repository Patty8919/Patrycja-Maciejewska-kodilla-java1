package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.SocialMedia;

public class FacebookPublisher implements SocialMedia {
    @Override
    public String predictWhatToUse() {
        return "[Facebook Publisher] ===> YGeneration";
    }
}

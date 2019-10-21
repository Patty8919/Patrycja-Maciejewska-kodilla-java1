package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WatcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId)")
    public void logEvent(OrderDto order, Long userId) {
        LOGGER.info("Beginnig to process order for customer: " + userId);
    }
}

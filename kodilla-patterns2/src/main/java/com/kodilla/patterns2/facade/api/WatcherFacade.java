package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFascade.processOrder(..))" +
            "&& args(order, userId)")
    public void logEvent(OrderDto order, Long userId) {
        LOGGER.info("Beginnig to process order for customer: " + userId);
    }
}

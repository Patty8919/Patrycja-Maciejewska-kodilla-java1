package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class NetworkOrderDecorator  extends AbstractPizzaOrderDecorator{
    public NetworkOrderDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getExtra() {
        return super.getExtra() + " by network";
    }
}

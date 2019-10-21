package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHamOrder extends AbstractPizzaOrderDecorator{
    public ExtraHamOrder (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getExtra() {
        return super.getExtra() + " + extra ham";
    }
}

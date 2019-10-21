package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraPepperoniOrder extends AbstractPizzaOrderDecorator{
    public ExtraPepperoniOrder (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getExtra() {
        return super.getExtra() + " + extra pepperoni";
    }
}

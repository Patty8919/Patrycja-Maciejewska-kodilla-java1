package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("First bun")
                .ingredient("Salad")
                .burgers("One burger")
                .ingredient("Cucumber")
                .ingredient("Onion")
                .sauce("Spicy")
                .ingredient("Bacon")
                .bun("Top")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);

    }
}

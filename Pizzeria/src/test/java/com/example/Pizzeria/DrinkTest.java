package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Drink;

public class DrinkTest {

    @Test
    public void testCreazioneDrink() {
        Drink drink = new Drink("Coca Cola", 100, 2.5);
        assertEquals("Coca Cola", drink.getName());
        assertEquals(100, drink.getCalories());
        assertEquals(2.5, drink.getPrice());
    }
}

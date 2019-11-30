package src.day32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    @Test
    void hasButter() {

        Food food = new Food();
        food.oil = "butter";
        Boolean actual = food.hasButter("butter");
        assertEquals(true, actual);
    }

    @Test
    void taste(){
    }
}



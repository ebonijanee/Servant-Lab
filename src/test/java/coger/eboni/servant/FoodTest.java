package coger.eboni.servant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FoodTest {
    private Food testFood;


    @BeforeEach
    public void setUp() {
        testFood = new Food("chicken", true);
    }

    @Test
    @DisplayName("Test - Food Safety")
    public void testFoodSafety() {
        Boolean actual = testFood.getSafe();
        Boolean expected = true;
        Assertions.assertTrue(actual);
    }
}
package coger.eboni.servant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RobotTest {
    private Robot testRobot;


    @BeforeEach
    public void setUp() {
        testRobot = new Robot("Big Bot", "579L086");
    }

    @Test
    @DisplayName("Test - Robot Name")
    public void testRobotName() {
        String actual = testRobot.getName();
        String expected = "Big Bot";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Test - Model Number")
    public void testModelNumber() {
        String actual = testRobot.getmodelNumber();
        String expected = "579L086";
        Assertions.assertEquals(actual, expected);
    }
}
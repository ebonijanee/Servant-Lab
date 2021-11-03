package coger.eboni.servant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


    public class ButlerTest {
        private Butler testButler;


        @BeforeEach
        public void setUp() {
            testButler = new Butler("Jeffrey", 29);
        }

        @Test
        @DisplayName("Test - Name")
        public void testButlerName() {
            String actual = testButler.getName();
            String expected = "Jeffrey";
            Assertions.assertEquals(actual, expected);
        }

        @Test
        @DisplayName("Test - Age")
        public void testButlerAge() {
            Integer actual = testButler.getAge();
            Integer expected = 29;
            Assertions.assertEquals(actual, expected);
        }
    }

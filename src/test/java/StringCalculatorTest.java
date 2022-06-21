import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator myStringCalc;

    @BeforeEach
    public void setUp() {
        myStringCalc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        myStringCalc = null;
    }

    @Test
    //this test checks if calling the function with a negative number throws an exception
    public void detectCapitalUseTest1() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myStringCalc.add("-1,5"));
        String expectedMessage = "negatives not allowed";
        String actualMessage = e.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));

    }
    @Test
    //this test checks if numbers over 1000 are ignored
    public void detectCapitalUseTest2() {
        int expected = 1;
        int actual = myStringCalc.add("1,1000");

        assertTrue(actual == expected);
    }


}

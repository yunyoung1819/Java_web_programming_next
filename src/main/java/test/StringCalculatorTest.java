package test;

import calculator.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_또는_빈문자() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_숫자하나() throws Exception {
        assertEquals(1, cal.add("1"));
    }
}

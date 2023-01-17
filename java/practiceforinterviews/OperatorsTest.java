package practiceforinterviews;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static 

import org.junit.Ignore;
import org.junit.Test;


public class OperatorsTest {
    
    @Test
    public void testAdd()
    {
        assertEquals(2,1+1);
    }

    @Test
    @Ignore()
    public void Add2Numbers()
    {
        Operators op = new Operators();
        int a = 2; int b = 2;
        int expected = a+b;
        int sum = Operators.Add(a, b);
        assertEquals(expected, sum);
        assertTrue("add is correct", (sum == 4));

    }

    @Test
    public void Add2LargeNumbers()
    {
        Operators op = new Operators();
        int a = 1234567899; int b = 1234567890;
        int expected = a+b;
        int sum = Operators.Add(a, b);
        assertEquals(expected, sum);
        assertTrue("add is correct", (sum == expected));

    }

    @Test
    public void Multiply2Numbers()
    {
        int a = 1234567899; int b = 1234567890;
        int expected = a*b;
        int sum = Operators.Multiply(a, b);
        assertEquals(expected, sum);
        assertTrue("Multiply is correct", (sum == expected));
    }
}

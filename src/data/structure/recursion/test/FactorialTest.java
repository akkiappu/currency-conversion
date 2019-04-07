package data.structure.recursion.test;

import data.structure.recursion.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testCalculate(){
        Factorial obj = new Factorial();
        assertEquals(obj.calculate(5), 120);
        assertEquals(obj.calculate(6), 720);
        assertEquals(obj.calculate(1), 1);
        assertEquals(obj.calculate(-3), 1);
    }
}

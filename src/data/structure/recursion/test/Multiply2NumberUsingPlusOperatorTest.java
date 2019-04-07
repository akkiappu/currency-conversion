package data.structure.recursion.test;

import data.structure.recursion.Multiply2NumberUsingPlusOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Multiply2NumberUsingPlusOperatorTest {
    @Test
    public void testMultiply(){
        Multiply2NumberUsingPlusOperator obj = new Multiply2NumberUsingPlusOperator();
        assertEquals(obj.multiply(2,4),8);
        assertEquals(obj.multiply(8,4),32);
        assertEquals(obj.multiply(1,4),4);
    }
}

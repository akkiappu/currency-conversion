package data.structure.recursion.test;

import data.structure.recursion.SumOfNNaturalNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNNaturalNumbersTest {
    @Test
    public void testCalculate(){
        SumOfNNaturalNumbers obj = new SumOfNNaturalNumbers();
        assertEquals(obj.calculate(10),55);
        assertEquals(obj.calculate(5),15);
        assertEquals(obj.calculate(1),1);
        assertEquals(obj.calculate(0),0);
        assertEquals(obj.calculate(-10),0);
    }
}

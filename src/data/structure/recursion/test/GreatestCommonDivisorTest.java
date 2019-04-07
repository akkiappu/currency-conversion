package data.structure.recursion.test;

import data.structure.recursion.GreatestCommonDivisor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    public void testFindGCD(){
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        assertEquals(obj.findGCD(new int[]{12,6,9,18}),3);
        assertEquals(obj.findGCD(new int[]{12,10,9,18}),1);
        assertEquals(obj.findGCD(new int[]{120,60,2400,180}),60);
        assertEquals(obj.findGCD(new int[]{1,2,3,8}),1);
    }
}

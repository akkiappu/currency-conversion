package data.structure.recursion.test;

import data.structure.recursion.StringWordReverse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringWordReverseTest {
    @Test
    public void testReverseWord(){
        StringWordReverse obj  = new StringWordReverse();
        assertEquals(obj.reverseWord("Its my life have").trim(),"have life my Its");
        assertEquals(obj.reverseWord("Its").trim(),"Its");
        assertEquals(obj.reverseWord("").trim(),"");
    }
}

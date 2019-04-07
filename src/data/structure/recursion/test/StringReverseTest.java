package data.structure.recursion.test;

import data.structure.recursion.StringReverse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {
    @Test
    public void testReverse(){
        StringReverse obj = new StringReverse();
        assertEquals(obj.reverse("Hello"),"olleH");
        assertEquals(obj.reverse(""),"");
        assertEquals(obj.reverse("H"),"H");
    }
}

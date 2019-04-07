package problem.solving.Test;

import junit.framework.Assert;
import org.junit.Test;
import problem.solving.LongestWordInDictionary;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionaryTest {
    @Test
    public void findLongestWord(){
        LongestWordInDictionary testClass = new LongestWordInDictionary();
        List<String> expected = Arrays.asList(new String[]{"apple"});
        List<String> actual = testClass.find(new String[]{"ale", "apple", "monkey", "plea"} ,"abpcplea");
        Assert.assertEquals(expected,actual);

        expected = Arrays.asList(new String[]{"geeksgeeks"});
        actual = testClass.find(new String[]{"pintu", "geeksfor", "geeksgeeks", "forgeek"}  ,"geeksforgeeks");
        Assert.assertEquals(expected,actual);

        expected = Arrays.asList(new String[]{"toe","teo"});
        actual = testClass.find(new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana","teo"}  ,"oet");
        Assert.assertEquals(expected,actual);



    }
}

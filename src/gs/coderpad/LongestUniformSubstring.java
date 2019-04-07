/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 */
package gs.coderpad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformSubstring {
    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input){
        int longestStart = -1;
        int longestLength = 0;

        // your code goes here
        int currentLengthCount = 1;
        if(input.length() == 0){
            return new int[]{ longestStart, longestLength };
        }
        longestLength++;
        longestStart++;
        for(int i = 0; i < input.length() - 1;i++){
            if(input.charAt(i) != input.charAt(i+1)){
                if(currentLengthCount > longestLength){
                    longestLength = currentLengthCount;
                    longestStart = i - --currentLengthCount;
                }
                currentLengthCount = 1;
                continue;
            }
            currentLengthCount++;
        }
        /****
         * int longestStart = -1;
         *         int longestLength = 0;
         *
         *         // your code goes here
         *         if(input.length() == 0){
         *             return new int[]{ longestStart, longestLength };
         *         }
         *         longestStart++;
         *         int currentLength = ++longestLength;
         *         char currentCh = input.charAt(0);
         *         for(int i = 1; i < input.length(); i++){
         *             if(currentCh != input.charAt(i)){
         *                 if(currentLength > longestLength){
         *                     longestLength = currentLength;
         *                     longestStart = i - currentLength;
         *                 }
         *                 currentCh = input.charAt(i);
         *                 currentLength = 1;
         *                 continue;
         *             }
         *             currentLength++;
         *         }
         *         return new int[]{ longestStart, longestLength };
         */
        return new int[]{ longestStart, longestLength };
    }

    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});
        testCases.put("caabbbbcffghiiiddccno", new int[]{3, 4});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}

package data.structure.recursion;

import java.util.Arrays;

public class StringWordReverse {
    public String reverseWord(String string){
        return reverse(string.split(" "));
    }

    private String reverse(String[] words){
        if(words.length <= 1){
            return words[0];
        }
        return reverse( Arrays.copyOfRange(words, 1, words.length)) + " " + words[0] ;
    }

    public static void main(String[] args) {
        StringWordReverse obj  = new StringWordReverse();
        System.out.println(obj.reverseWord("Its my life have").trim());
    }
}

package string.programs.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAnagrams {
    public static void main(String[] args) {
        isAnagram("anagram","margana");
        isAnagram("xyzw","xyxy");

    }

    static boolean isAnagram(String a, String b) {
        if (a.length() == 0 || b.length() == 0 || a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return false;
        }
        Map<Character, Integer> characterRepeatCountAnagram1 = new HashMap<>();
        Map<Character, Integer> characterRepeatCountAnagram2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            Character charFromAnagram1 = Character.toLowerCase(a.charAt(i));
            if (characterRepeatCountAnagram1.containsKey(charFromAnagram1)) {
                int currentCount = characterRepeatCountAnagram1.get(charFromAnagram1);
                characterRepeatCountAnagram1.put(charFromAnagram1, ++currentCount);
            } else {
                characterRepeatCountAnagram1.put(charFromAnagram1, 1);
            }
            Character charFromAnagram2 = Character.toLowerCase(b.charAt(i));
            if (characterRepeatCountAnagram2.containsKey(charFromAnagram2)) {
                int currentCount = characterRepeatCountAnagram2.get(charFromAnagram2);
                characterRepeatCountAnagram2.put(charFromAnagram2, ++currentCount);
            } else {
                characterRepeatCountAnagram2.put(charFromAnagram2, 1);
            }
        }

        //compare repetition count
        Set<Character> keySet = characterRepeatCountAnagram1.keySet();
        for(Character character : keySet){
            if(characterRepeatCountAnagram2.get(character) == null || characterRepeatCountAnagram1.get(character).intValue() != characterRepeatCountAnagram2.get(character).intValue()){
                System.out.println("Not Anagrams");
                return false;
            }
        }
        System.out.println("Anagrams");
        return true;
    }
}

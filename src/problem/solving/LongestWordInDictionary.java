package problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LongestWordInDictionary {
   public List<String> find(String[] dict, String matcher){
       List<String> permanentList = Arrays.asList(matcher.split(""));
       List<String> longestWords = new ArrayList<>();
       int maxLength = 0;
       for(String word : dict){
           if(word.length() < maxLength){
               continue;
           }
           List<String> tempList = new ArrayList<>(permanentList);
           StringBuilder sb = new StringBuilder();
           for(String s : word.split("")){
               if(tempList.contains(s)){
                   tempList.remove(s);
                   sb.append(s);
                   continue;
               }
               break;
           }
           if(sb.toString().equals(word) && word.length() >= maxLength){
               maxLength = word.length();
               Iterator<String> iterator = longestWords.iterator();
               while(iterator.hasNext()){
                   if(iterator.next().length() < word.length()){
                       iterator.remove();
                   }
               }
               longestWords.add(word);
           }

       }

       return longestWords;
   }
}

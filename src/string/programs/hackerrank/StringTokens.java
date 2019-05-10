package string.programs.hackerrank;

public class StringTokens {
    public static void main(String[] args) {
        //matching the regular expression [A-Za-z !,?._'@]+

        testTokens("He is a very very good boy, isn't he?","[ !,?._'@]+");
        testTokens("           He is a very very good boy, isn't he?","[ !,?._'@]+");
        testTokens("           ","[ !,?._'@]+");
        testTokens("word1, word2 word3@word4?word5.word6","[, ?.@]+");
        testTokens("SeeksforforSeeksfor","for");
    }

    private static void testTokens(String s, String regex){
        if(s.trim().length() == 0){
            System.out.println(0);
            return;
        }
        String strToken[] = s.trim().split("[ !,?._'@]+");
        System.out.println(strToken.length);
        for (String token : strToken)
            System.out.println(token);
    }
}

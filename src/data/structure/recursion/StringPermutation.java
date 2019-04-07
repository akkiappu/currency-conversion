package data.structure.recursion;

public class StringPermutation {

    public void print(String word) {

    }

    private String permute(String str) {
        int inc = 0;
        if (str.length() == 1) {
            return str;
        }
        String temp = str.substring(0, 1);
        String output1 = permute(removeChar(str,inc++));
        String output2 = permute(removeChar(str,inc++));
        System.out.println(temp+output1);
        System.out.println(temp+output2);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new StringPermutation().permute("JSP"));
    }
    private String removeChar(String str, int p){
        return str.substring(0, p) + str.substring(p + 1);
    }
}

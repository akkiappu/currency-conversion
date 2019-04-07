package data.structure.recursion;

public class StringReverse {
    public String reverse(String string){
        if(string.length() <= 1){
            return string;
        }

        return reverse(string.substring(1)) + string.charAt(0);
    }

    public static void main(String[] args) {
        StringReverse obj = new StringReverse();
        System.out.println(obj.reverse("SAPIENT"));
    }
}

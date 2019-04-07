package string.programs.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        //sample input
        /*3
        A-Z])(.+)
        [AZ[a-z](a-z)
        batcatpat(nat*/
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e){
                System.out.println("Invalid");
            }
        }

    }

}

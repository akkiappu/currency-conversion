package string.programs.hackerrank;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A.length() <= 1){
            System.out.println("Yes");
            return;
        }
        for(int front = 0,rear = A.length() - 1; front < (A.length()/2); front++,rear--){
            if(A.charAt(front) != A.charAt(rear)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

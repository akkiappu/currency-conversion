package string.programs;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {


        //program3 Find smallest and largest
        String s = "welcometojava";
        int k = 3;
        String smallest = "";
        String largest = "";

        String str[] = new String[s.length()- (k-1)];
        for(int currentIndex = 0; k <= s.length(); k++,currentIndex++){
            str[currentIndex] = s.substring(currentIndex,k);
            if(currentIndex > 0){
                   if(str[currentIndex].compareTo(smallest) < 0){
                       smallest = str[currentIndex];
                       continue;
                   }
                   if(str[currentIndex].compareTo(largest) > 0){
                       largest = str[currentIndex];
                       continue;
                   }

            }else {
                smallest = str[currentIndex];
                largest = str[currentIndex];
            }

        }


        System.out.println(smallest);
        System.out.println(largest);


        System.exit(0);

        //Program 2
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));

        //Program 1
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) < 0 ? "No" : "");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())
        + " " + B.substring(0,1).toUpperCase() +B.substring(1,B.length()));

    }


}

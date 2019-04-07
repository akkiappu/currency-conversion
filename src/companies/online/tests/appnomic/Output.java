package companies.online.tests.appnomic;

import java.util.ArrayList;
public class Output {
    public static void main(String[] args) {

        //Program 1 : Remove negative numbers
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(-3);
        a.add(-4);
        a.add(44);
        a.add(-8);
        int i=0;
        while(i<a.size()) {
            if (a.get(i) < 0)
                a.remove(i);
            else
                i++;
        }
        System.out.println(a);


        //program 2
        Integer in = null;
        int b = in;
        System.out.println(b);
    }
}

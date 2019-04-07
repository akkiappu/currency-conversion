package generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsSuperType {
    public static void main(String[] args) {
        //Super is a lower bound, or consumer
        List<? super Integer> superIntegerList1 = new ArrayList<Integer>();
        List<? super Integer> superIntegerList2 = new ArrayList<Number>();
        List<? super Integer> superIntegerList3 = new ArrayList<Object>();
        /**
         * We can add any Integer or its sub type element to list.
         */
        superIntegerList1.add(new Integer(1));

        // superIntegerList2.add(new Object()); not allowed

        /*****
         * Similarly we can read only Object type element, because there is no surety this list point to which type.
         */

        /*for (Number number : superIntegerList1) { not allowed
            System.out.println(number);
        }*/

        for(Object obj : superIntegerList2){
            System.out.println(obj);
        }

    }
}

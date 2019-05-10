package self.practice;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i < 50000; i++){
            integerList.add(i);
        }

        new Thread(()->integerList.iterator().forEachRemaining(System.out::println)).start();

        System.out.println("after starting thread");
        for(int i = 0; i < 500; i++){
            System.out.println("adding after");
            integerList.add(i);
        }
        final ConcurrentModificationExTest c = new ConcurrentModificationExTest();
        m(c);

    }

    public static void m(ConcurrentModificationExTest c){
        c = new ConcurrentModificationExTest();
    }
}

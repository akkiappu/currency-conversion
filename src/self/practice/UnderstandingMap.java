package self.practice;

import java.util.HashMap;
import java.util.Map;

public class UnderstandingMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Integer i = 5;
        map.computeIfAbsent(i, (k)->""+(i+1));
        /*String empNames[]= new String[]{"Akhilesh","Sanjay","Anup","Sashakt","Akhilesh","Sai","Sanjay","Aravind","Sai","Akhilesh"};
        Map<Integer,String> map = new HashMap<>();
        Map<String,Integer> empMap = new HashMap<>();
        //find count of each emp names
        for(String emp : empNames){
            empMap.compute(emp,(k,v)->v == null ? 1 : v+1);
        }
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(1,"Akhilesh");
        System.out.println(map.getOrDefault(2,"This key not exist"));
        map.put(2,"Sanjay");
        System.out.println(map.compute(2,(k,v)->null));

        map.put(3,"Anup");
        System.out.println(map.computeIfAbsent(4,(k)->"abc"));
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*int a = 4,b = 0;
        int c=-1;
        try{
            c = a/b;
        }
        catch(Exception e){
            System.out.println("ex");

        }
        finally {
            System.out.println("fin");
        }*/
       /* try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d =  f1.doubleValue();
            System.out.println(x+b+d);
        }catch (Exception e){}*/


    }

}

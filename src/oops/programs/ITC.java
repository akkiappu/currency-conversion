package oops.programs;

import java.util.EnumMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;


class Employee{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class TestInternalObjectSync{
    public static void main(java.lang.String[] args) {
        Employee e1 = new Employee();
        e1.setAddress("VRR Lake front");
        Thread t1 = new Thread(()->{
            synchronized (e1){
                System.out.println(e1.getAddress());
                try {
                    Thread.sleep(2000);
                    System.out.println(e1.getAddress());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        e1.setAddress("Adarsh Palm");
    }
}


class Pupil{
    java.lang.String name = "un";

    public java.lang.String getName() {
        return name;
    }
}

class John extends  Pupil{
    java.lang.String name = "john";
}
public class ITC {
    public static void main(java.lang.String[] args) {
        Function f;
        ReentrantLock lock = new ReentrantLock();
        lock.tryLock();
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("greet");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(t1);
        System.out.println(t2.getState());

        t2.start();
        System.out.println(t2.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t2.getState());
        EnumMap<Week, Integer> map = null;
        map.put(Week.Monday,1);
    }

}

enum Week{
    Monday,sunday;
}
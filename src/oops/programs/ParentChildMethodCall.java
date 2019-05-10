package oops.programs;

interface  inter{

}
class sup{
    static int x;
    static {
        hello();
        System.out.println(new Child(3).subtraction(33,3));
        System.out.println(x);
        System.out.println("I am in static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");

    }
    public static void hello(){
        System.out.println("IN static hello method");
    }

    sup(){
        System.out.println("in sup constructor");
    }
}
class Parent extends sup{
    static {
        System.out.println("Parent I am in static block");
        System.out.println("Parent Static block will be called first than constructor!!!");
        System.out.println("Parent Static block will be called only once.");
    }



    int multiply(int x, int y){

        int temp = 0;
        for(int i = 0; i < y; i++){
            temp = temp + x;
        }
        return temp;
    }

    int add(int x, int y){
        return x + y;
    }
}

class Child extends Parent{
    public static int x = 5;
    public Child(int x) {
    }
    int multiply(int x, int y){
        return x * y;
    }

    int subtraction(int x, int y){
        return x - y;
    }
}

public class ParentChildMethodCall {
    public static void main(String[] args) {
        System.out.println(new Child(3).subtraction(33,31));

    }
}

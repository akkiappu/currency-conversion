package data.structure.recursion;

public class Factorial {
    public int calculate(int num){
        if(num <= 1){
            return 1;
        }
        return num * calculate(num - 1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.calculate(5));
    }
}

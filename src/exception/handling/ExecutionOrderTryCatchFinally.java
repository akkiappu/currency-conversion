package exception.handling;

/******
 * Finally block always execute, if try or catch block execute successfully then after executing finally block
 * successfully control again go to the try/catch block(if and only if finally not returning any value).
 */
public class ExecutionOrderTryCatchFinally {
    private int division(int numerator, int denominator){
        try{
            System.out.println("Executing try block");
            int result = numerator/denominator;
            return result;
        } catch(ArithmeticException ae){
            System.out.println("Executing catch block");
            System.out.println(ae.getMessage());
            return -1;
        } finally{
            System.out.println("Executing finally block");
        }
    }

    public static void main(String[] args) {
        ExecutionOrderTryCatchFinally obj = new ExecutionOrderTryCatchFinally();
        System.out.println(obj.division(20,10));
        System.out.println(obj.division(20,0));
    }
}

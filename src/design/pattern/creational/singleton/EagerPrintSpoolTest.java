package design.pattern.creational.singleton;

public class EagerPrintSpoolTest {
    public static void main(String[] args) {
        EagerPrintSpool eagerPrintSpool = EagerPrintSpool.getInstance();
        EagerPrintSpool eagerPrintSpool2 = EagerPrintSpool.getInstance();

        if(eagerPrintSpool == eagerPrintSpool2){
            System.out.println("Singleton Objects are Same");
        } else{
            System.out.println("Singleton Objects are not Same");
        }
    }
}

package design.pattern.creational.singleton;

public class EagerPrintSpool {
    private static final EagerPrintSpool PRINT_SPOOL_INSTANCE = new EagerPrintSpool();
    private EagerPrintSpool(){}

    public static EagerPrintSpool getInstance(){
        return PRINT_SPOOL_INSTANCE;
    }
}

package design.pattern.behavioral.template;

public class IMPS extends TemplatePaymentTransfer {

    @Override
    protected void transfer() {
        System.out.println("IMPS transfer successfully completed");
    }
}

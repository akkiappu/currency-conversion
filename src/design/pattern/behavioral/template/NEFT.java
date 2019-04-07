package design.pattern.behavioral.template;

public class NEFT extends TemplatePaymentTransfer {
    @Override
    protected void transfer() {
        System.out.println("NEFT transfer successfully completed");
    }
}

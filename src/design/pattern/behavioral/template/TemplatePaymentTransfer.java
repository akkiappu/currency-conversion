package design.pattern.behavioral.template;


public abstract class TemplatePaymentTransfer{

    public final void initiate(){
        doPreProcess();
        transfer();
        doPostProcess();
    }
    private void doPreProcess(){
        System.out.println("Pre process successfully completed");
    }
    protected abstract void transfer();

    private void doPostProcess(){
        System.out.println("Post process successfully completed");
    }
}




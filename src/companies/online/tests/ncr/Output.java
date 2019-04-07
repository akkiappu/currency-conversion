package companies.online.tests.ncr;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("In My Thread override run");
    }
}
public class Output {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
    }
}


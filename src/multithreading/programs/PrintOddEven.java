package multithreading.programs;

public class PrintOddEven {
    int startRange = 1;
    int endRange = 100;

    public static void main(String[] args) {
        new PrintOddEven().print();
    }

    private void print() {
        Runnable task = () -> {
            synchronized (this) {
            while (startRange <= endRange) {
                    System.out.println(Thread.currentThread().getName() + " :: " + startRange++);
                    this.notify();
                    try {
                        if (startRange <= endRange) {
                            this.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        Thread first = new Thread(task);
        Thread second = new Thread(task);
        first.start();
        second.start();
    }
}

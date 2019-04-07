package multithreading.programs;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadPool {
    private final int poolSize;
    private final Queue<Thread> threadQueue;
    private final Queue<Runnable> jobs;


    public ThreadPool(int poolSize) {
        this.poolSize = poolSize;
        threadQueue = new LinkedList<>();
        jobs = new LinkedList<>();
        createThreads();
        startThreads();
    }

    private void createThreads(){
        for(int i = 0; i < poolSize; i++){
            threadQueue.add(new Thread(()->{
                while(true){
                    Runnable job = null;
                       synchronized (jobs){
                           if(jobs.size() > 0){
                               job = jobs.remove();
                           }
                       }
                       if(job != null){
                           job.run();
                       }
                }
            }));
        }
    }

    private void startThreads(){
        threadQueue.iterator().forEachRemaining(thread -> thread.start());
    }

    public void submit(Runnable job){
        jobs.add(job);
    }

    public static void main(String[] args){
        ThreadPool threadPool = new ThreadPool(5);
        threadPool.submit(()->{
            System.out.println("job 1 start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 1 end");
        });

        threadPool.submit(()->{
            System.out.println("job 2 start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 2 end");
        });

        threadPool.submit(()->{
            System.out.println("job 3 start");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 3 end");
        });

        threadPool.submit(()->{
            System.out.println("job 4 start");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 4 end");
        });

        threadPool.submit(()->{
            System.out.println("job 5 start");
            try {
                Thread.sleep(3300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 5 end");
        });

        threadPool.submit(()->{
            System.out.println("job 6 start");
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job 6 end");
        });


    }
}
package multithreading.programs;

public class DaemonThread {
    public static void main(String[] args){
        Thread daemon = new Thread(()->{System.out.println("Daemon Thread start");
        try {

            Thread innerDaemon = new Thread(()->{System.out.println("innerDaemon Thread start");
                try {
                    Thread.sleep(200000);
                    System.out.println("innerDaemon Thread end");
                } catch(Exception e){e.printStackTrace();}
                finally {
                    System.out.println("in innerDaemon thread finally");
                }
            });
            innerDaemon.setDaemon(false);
            innerDaemon.start();
            System.out.println(innerDaemon.isDaemon());
            Thread.sleep(200000);
            System.out.println("Daemon Thread end");
        } catch(Exception e){e.printStackTrace();}
        finally {
            System.out.println("in daemon thread finally");
        }
        }

        );
        Thread user = new Thread(()->{System.out.println("user Thread start");
            try {
                Thread.sleep(10000);
                System.out.println("user Thread end");

            } catch(Exception e){e.printStackTrace();}
            finally {
                System.out.println("in user thread finally");
            }
        });
        daemon.start();
        daemon.setDaemon(true);
        user.start();



    }
}

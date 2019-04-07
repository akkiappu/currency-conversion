        package multithreading.programs;

        public class PrintConsecutiveNumberByThreads {
            int whoseThreadTurnToRun = 1;
            int fromNumber;
            int toNumber;
            int threadSize;

            public PrintConsecutiveNumberByThreads(int threadSize, int fromNumber, int toNumber){
                this.fromNumber = fromNumber;
                this.toNumber = toNumber;
                this.threadSize = threadSize;
            }
            public static void main(String[] args) {
                PrintConsecutiveNumberByThreads obj = new PrintConsecutiveNumberByThreads(4,1,100);
                Runnable task = obj.createRunnableTask();
                obj.createAndExecuteThread(task);

            }

            private void createAndExecuteThread(Runnable task){
                for(int i = 0; i < threadSize; i++){
                    new Thread(task,String.valueOf(i+1)).start();
                }
            }

            private Runnable createRunnableTask() {

                Runnable task = () -> {
                    synchronized (this) {
                        while (fromNumber <= toNumber) {
                            if (whoseThreadTurnToRun != Integer.parseInt(Thread.currentThread().getName())) {
                                this.notifyAll();
                            } else {
                                System.out.println("Thread "+Thread.currentThread().getName() + " :: " + fromNumber++);
                                whoseThreadTurnToRun = whoseThreadTurnToRun % threadSize + 1;
                                this.notifyAll();
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                return task;
            }

        }

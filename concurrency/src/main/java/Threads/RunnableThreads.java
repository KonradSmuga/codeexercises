package Threads;

public class RunnableThreads implements Runnable {

    Thread toBeJoined;

    public RunnableThreads(Thread toBeJoined) {
        this.toBeJoined = toBeJoined;
    }

    public void run() {
        for(int i = 20; i >=0 ; i--){

            System.out.println(i);
            try {

                if(i < 15){
                    toBeJoined.join();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread ends. ");
                return;

            }

        }
    }
}

package Threads;

public class ExtendedThread extends Thread {
    private Thread threadToInterrupt;


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            double pow = Math.pow(2, i);
            System.out.println(pow);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("asd");
            }
        }
    }



}

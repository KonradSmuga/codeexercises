package newLambda;

import newLambda.multithread.MyThread;

public class Ex4 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

        });

        thread.start();

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
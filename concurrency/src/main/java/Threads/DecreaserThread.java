package Threads;

import util.MyCounter;

public class DecreaserThread extends Thread {

    private MyCounter myCounter;

    public DecreaserThread(MyCounter myCounter) {
        this.myCounter = myCounter;
    }


    public MyCounter getMyCounter() {
        return myCounter;
    }

    public void run() {
        for(int i =0; i < 200; i ++){
            myCounter.decrement();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

}

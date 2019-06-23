package Threads;

import util.MyCounter;
import util.PersonIncreasing;

public class NameIncreaser extends Thread {

    private final int threadNumber;
    private PersonIncreasing counter;

    public NameIncreaser(PersonIncreasing counter, int threadNumber) {
        this.counter = counter;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread number:" + threadNumber + "started");

        for(int i =0; i<1000000; i++){
            counter.incrementName();


        }
        System.out.println("");
        System.out.format("thread number %d finished \n", threadNumber);
    }
}

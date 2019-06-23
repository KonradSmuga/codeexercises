package Threads;

import util.PersonIncreasing;

public class SurnameIncreaser extends Thread{


    private final int threadNumber;
    private PersonIncreasing personIncreasing;

    public SurnameIncreaser(PersonIncreasing personIncreasing, int threadNumber) {
        this.personIncreasing = personIncreasing;
        this.threadNumber  = threadNumber;
    }

    public void run() {
        System.out.println("Thread number:" + threadNumber + "started");
        System.out.println("--------------");
        for(int i =0; i<1000000; i++){
            personIncreasing.incrementSurname();
        }
    }


}



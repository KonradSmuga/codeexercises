import Threads.*;
import util.PersonIncreasing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {


//        ExtendedThread extendedThread = new ExtendedThread();
//        Thread firstThread = new Thread(new RunnableThreads(extendedThread));
//
//        firstThread.start();
//        extendedThread.start();

//        MyCounter counter = new MyCounter();
//
//        DecreaserThread decreaserThread = new DecreaserThread(counter);
//        IncreasedThread increasedThread = new IncreasedThread(counter);
//
//        increasedThread.start();
//        decreaserThread.start();
//
//        System.out.println(counter.getCounter());
        PersonIncreasing personIncreasing = new PersonIncreasing();

        NameIncreaser nameIncreaser = new NameIncreaser(personIncreasing, 1);
        SurnameIncreaser surnameIncreaser = new SurnameIncreaser(personIncreasing, 2);

        NameIncreaser nameIncreaser1 = new NameIncreaser(personIncreasing,3);
        SurnameIncreaser surnameIncreaser1 = new SurnameIncreaser(personIncreasing,4 );

        nameIncreaser.start();
        surnameIncreaser.start();


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(nameIncreaser);
        executorService.submit(surnameIncreaser);
        executorService.submit(nameIncreaser1);
        executorService.submit(surnameIncreaser1);
        System.out.println(personIncreasing.getName());
        System.out.println(personIncreasing.getSurname());
    }

}


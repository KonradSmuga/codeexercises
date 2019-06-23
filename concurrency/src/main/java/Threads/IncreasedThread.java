package Threads;

import util.MyCounter;

public class IncreasedThread extends Thread{
    private MyCounter myCounter;

    public IncreasedThread(MyCounter myCounter) {
        this.myCounter = myCounter;
    }

    public void run() {
      for(int i =0; i < 200; i ++){
          myCounter.increment();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }


      }


    }
}

package newLambda.multithread;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for(int i =11; i <21; i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

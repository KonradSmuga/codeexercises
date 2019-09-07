package newLambda.multithread;

public class Ex4 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
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
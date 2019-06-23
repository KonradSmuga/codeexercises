import Threads.ExtendedThread;
import Threads.RunnableThreads;

public class Main {

    public static void main(String[] args) {


        ExtendedThread extendedThread = new ExtendedThread();
        Thread firstThread = new Thread(new RunnableThreads(extendedThread));

        firstThread.start();
        extendedThread.start();



    }
}

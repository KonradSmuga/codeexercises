package singleton.task;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LogingRunner {

    public static void main(String[] args) throws IOException {
        Loging loging = Loging.getInstance();
        loging.log(Level.INFO, "info msg");

    }
}

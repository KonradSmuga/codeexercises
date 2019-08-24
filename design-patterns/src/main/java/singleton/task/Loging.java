package singleton.task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Loging {

    private static Loging instance = null;

    private Loging() {

    }

    public static Loging getInstance() {

        if (instance == null) {
            return new Loging();
        }
        return instance;
    }

    public void log(Level level, String msg) {

        try {BufferedWriter buffedWriter  = Files.newBufferedWriter(Paths.get("log.txt"));
            LocalDateTime localDateTime = LocalDateTime.now();
            String x = "[" +localDateTime + " " + level + " " + msg;
            buffedWriter.write(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





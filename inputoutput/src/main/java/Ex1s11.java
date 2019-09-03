
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1s11 {

    public static void main(String[] args) {

        try (
                InputStream inputStream = Files.newInputStream(Paths.get("hello2.txt"));
                OutputStream outputStream = Files.newOutputStream(Paths.get("old_hello.txt"))
        ) {
            copy(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//
//    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
//        byte[] tab = new byte[1024];
//        int readLength = 0;
//        while ((readLength = inputStream.read(tab)) != -1) {
//            outputStream.write(tab,0, readLength);
//        }
//
//




        public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
            byte[] tab = new byte[1024];
            int readLength = 0;
            while((readLength = inputStream.read(tab)) != -1){
                outputStream.write(tab, 0, readLength);
            }
    }
}


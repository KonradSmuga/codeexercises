import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex5s23 {

    public static void main(String[] args) {

        try (
            OutputStream  outputStream = Files.newOutputStream(Paths.get("hello4.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        ){
            dataOutputStream.writeBytes("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

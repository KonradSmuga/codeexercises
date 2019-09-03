import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex5s23 {

    public static void main(String[] args) {

        try (
            OutputStream  outputStream = Files.newOutputStream(Paths.get("hello3.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        ){
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(11);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

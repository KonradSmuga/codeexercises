import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex6s26_read {

    public static void main(String[] args) {
        try (
                InputStream inputStream = Files.newInputStream(Paths.get("hello3.txt"));
                DataInputStream dataOutputStream = new DataInputStream(inputStream)
        ) {
            System.out.println("dataOutputStream.read() = " + dataOutputStream.readInt());
            System.out.println("dataOutputStream.read() = " + dataOutputStream.readInt());
            System.out.println("dataOutputStream.read() = " + dataOutputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


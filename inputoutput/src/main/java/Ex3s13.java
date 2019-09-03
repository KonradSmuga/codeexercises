import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex3s13 {

    public static void main(String[] args) {
        Path p = Paths.get("old_hello.txt");
        try {
            InputStream inputStream1 = Files.newInputStream(p);
            int read = inputStream1.read();
            System.out.println((char)read);
            System.out.println((char) inputStream1.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex7s36 {

    public static void main(String[] args) throws IOException {

        Files.createFile(Paths.get("Hello5.txt"));

        Files.move(Paths.get("hello5.txt"), Paths.get("hello5_1.txt"));

        Files.copy(Paths.get("hello5_1.txt"), Paths.get("hello_2.txt"));

        Files.delete(Paths.get("hello5_1.txt"));

    }
}



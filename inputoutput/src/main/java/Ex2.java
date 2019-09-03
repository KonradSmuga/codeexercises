import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex2 {

    public static void main(String[] args) {
        final Path path = Paths.get("hello2.txt");

        System.out.println("Files.exists(path) = " + Files.exists(path));
    }
}

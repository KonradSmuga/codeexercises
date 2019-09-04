import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9s39 {
    public static void main(String[] args) {

        System.out.println(getFilesInDirectory(Paths.get("c://udemy")));

    }

    public static List<String> getFilesInDirectory(Path p) {
        try {
            return Files.walk(p)
                    .filter(e -> !Files.isDirectory(e))
                    .map(e -> e.getFileName().toString())
                    .collect(Collectors.toList());

        } catch (IOException ex) {
            ex.printStackTrace();
            return List.of();
        }
    }
}
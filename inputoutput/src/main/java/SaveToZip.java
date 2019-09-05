import java.net.URI;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;


//kompresja plików do ZIP::
public class SaveToZip {
    public static void main(String[] args) throws Throwable {
        Map<String, String> env = new HashMap<>();
        env.put("create", "true");
        URI uri = URI.create("jar:file:/udemy/zip.zip");

        try (FileSystem zipfs = FileSystems.newFileSystem(uri, env)) {
            Path externalTxtFile = Paths.get("hello2.txt");
            Path pathInZipfile = zipfs.getPath("/hell3.txt");
            Files.copy(externalTxtFile, pathInZipfile,
                    StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
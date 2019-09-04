
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex7s28 {
//blokowanie pliku (zapis0 za pomocą filelock)
    public static void main(String[] args) {


        try (FileChannel fileChannel = FileChannel.open(Paths.get("hello3.txt"), StandardOpenOption.WRITE);) {

            FileLock lock = fileChannel.lock();
         while(true){

         }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

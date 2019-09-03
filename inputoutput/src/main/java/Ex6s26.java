import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Ex6s26 {

    public static void main(String[] args) throws FileNotFoundException {
        //1511
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("hello3.txt", "rw");){
            randomAccessFile.seek(4);
            final int i = randomAccessFile.readInt();

            randomAccessFile.seek(randomAccessFile.getFilePointer() - 4);

            randomAccessFile.writeInt(19);
            randomAccessFile.writeInt(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

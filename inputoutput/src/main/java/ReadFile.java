import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ReadFile {

    public static void main(String[] args) {

        readString();
        try {
            Scanner in = new Scanner(Paths.get("hello.txt"));
            int in1 = in.nextInt();
            System.out.println(in1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//wydrukowanie tylko tekstu
    public static void readString() {
        try {
            Scanner in1 = new Scanner(Paths.get("hello.txt"));
            String s = in1.nextLine();

            s = s.replaceAll("\\d", "");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

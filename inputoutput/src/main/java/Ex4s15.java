import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class Ex4s15 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://google.pl");
        try (
                InputStream inputStream1 = url.openStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream1);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            bufferedReader
                    .lines()
                    .forEach(e -> System.out.println(e));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

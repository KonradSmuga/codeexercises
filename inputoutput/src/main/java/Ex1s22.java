import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1s22 {

    public static void main(String[] args) {


        try (
                OutputStream outputStream = Files.newOutputStream(Paths.get("hello2.txt"));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 101; i++) {
                stringBuilder.append( " " +i);
            }
            bufferedWriter.write(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}

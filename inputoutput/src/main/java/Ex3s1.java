import java.nio.charset.Charset;
import java.util.SortedMap;

public class Ex3s1 {

    public static void main(String[] args) {
//jaki jest ustawiony charset na platformie
        Charset charset = Charset.defaultCharset();
        System.out.println(charset);
//wyswietlenie wszystkcih dostepnych kodowań
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();

        System.out.println(stringCharsetSortedMap);
    }
}

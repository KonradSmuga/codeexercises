import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".+a");
//        Matcher ada = p.matcher("Ada");
//        System.out.println("ada.matches() = " + ada.matches());

        System.out.println("p.matcher(\"Ryszard\").matches() = " + p.matcher("Ryszard").matches());

        final long l = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("Pattern.matches(\".+a\", \"Ada\") = " + Pattern.matches(".+a", "Ada"));
        }
        final long l1 = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++){
            Matcher ada = p.matcher("Ada");
            System.out.println(ada.matches());
        }
        final long l2 = System.currentTimeMillis();

        System.out.println(l1-l + " ms");
        System.out.println(l2-l1 + " ms");
    }
}

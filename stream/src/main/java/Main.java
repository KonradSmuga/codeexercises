import Optional.OptionalOnString;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        GenericInterfaceOfAll<String> lamdaInt = (a, b) -> a + " " + b;
//
//        System.out.println(
//                lamdaInt.process("John", "Doe"));
//        GenericInterfaceOfAll<Integer> lambdaNumbers = (a, b) -> a + b;
//        System.out.println(lambdaNumbers.process(3, 4));

//
//        LambdaPrint lambdaPrint = () -> System.out.println("hello world");
//        LambdaDouble lambdaDouble = (a) -> (Math.round(a));
//
//        System.out.println((int) lambdaDouble.lamda(4.2));
//        StringBuilder stringBuilder = new StringBuilder();
//
//
//        LambdaString reverse = (a) -> new StringBuilder().append(a).reverse().toString(); // odwrotność znaków StringBuilder
//        LambdaString toUpper = (a) -> a.toUpperCase();
//        LambdaString removeSpace = (a) -> a.replace(" ", "-");// replace zamiana znaków w Stringu
//
//        String textString ="asd qwee zxc";
//        Printer.print(reverse, textString);
//
//        Printer.print(toUpper, textString);
//        Printer.print(removeSpace, textString);

//
//        String result = OptionalOnString.getSomeValue()
//                .map(str -> str.toUpperCase())
//                .map(str -> str.replace(" ", "-"))
//                .filter(str -> str.length() > 5)
//                .orElse("domyslna wartość");
//        System.out.println(result);

        List<String> someStrings = Arrays.asList("asd", "Konrad","Konrad", "done", "house", "Java");
        Set<String> processedNames =someStrings.stream()
                .filter(str -> str.length() > 5)
                .map(str -> str + "a")
                .peek(str -> System.out.println("Filtered value: " + str))
                .collect(Collectors.toSet());

processedNames.forEach(name -> System.out.println(name));


        //wiecej niz 5 znaków, dopisze dowolna wartosc typu string, wydrukuje wszystkie obiekty (*peek), zbierze do setu
    }
}

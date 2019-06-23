import lamdaInterfaces.*;

public class Main {

    public static void main(String[] args) {
        GenericInterfaceOfAll<String> lamdaInt = (a, b) -> a + " " + b;

        System.out.println(
                lamdaInt.process("John", "Doe"));
        GenericInterfaceOfAll<Integer> lambdaNumbers = (a, b) -> a + b;
        System.out.println(lambdaNumbers.process(3, 4));


        LambdaPrint lambdaPrint = () -> System.out.println("hello world");
        LambdaDouble lambdaDouble = (a) -> (Math.round(a));

        System.out.println((int) lambdaDouble.lamda(4.2));
        StringBuilder stringBuilder = new StringBuilder();


        LambdaString reverse = (a) -> new StringBuilder().append(a).reverse().toString(); // odwrotność znaków StringBuilder
        LambdaString toUpper = (a) -> a.toUpperCase();
        LambdaString removeSpace = (a) -> a.replace(" ", "-");// replace zamiana znaków w Stringu

        String textString ="asd qwee zxc";
        Printer.print(reverse, textString);

        Printer.print(toUpper, textString);
        Printer.print(removeSpace, textString);
    }
}

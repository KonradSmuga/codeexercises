//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//
//public class Zad2 {
//    //552 232 222
//    //323211312
//    //323 232333
//    //322323 323
//    private static String correctNumberR = "^[0-9]{3} ?[0-9]{3} ?[0-9]{3}$";
//    private static String companyNumberR = ".*370";
//    private static String happyNumberR = "[0-9]{3} ?[0-9]77 ?[0-9]77";
//    private static String balanceNumberR = "[0-9]{3} ?([0-9]{3}) ?([0-9]{3})";
//    private static String isByteNumberR = "[0-9]{2}[1248] ?[0-9]{2}[1248] ?[0-9]{2}[1248]"; //Numer bajtkowy, to taki numer który ma potęgi dwójki na 3, 6, 9 pozycji np.
//
//    public static void main(String[] args) {
//        List<String> stringList = getAllNumbersFromFile();
//
//        List<String> correctNumbers = getCorrectNumbersList(stringList);
//        System.out.println("Podpunkt 1: " + correctNumbers.size());
//        printCompanyNumbers(correctNumbers);
//        printHappyNumbers(correctNumbers);
//
////        System.out.println(stringList);
//    }
//
//    //555 (444) (333)
//    private static int sumOf(String s) {
//        //suma liczb np 543 = 12;
//        int sum = 0;
//        int a = Integer.parseInt(s);
//
//        while (a > 10) {
//            sum += a % 10;
//            a /= 10;
//        }
//        return sum;
//        //todo
////        final char[] chars = s.toCharArray();
//        // '4' -> 52 - 48 = 4
//        // '5' -> 53 -48 = 5
//        // '0' -> 48 - 48 = 0;
//
//        int a = 546;
//
//        while (a / 10 != 0) {
//            a = a / 10;
//        }
//        // a % 10 = 6
//        // 546 / 10 = 54;
//
//        // 54 % 10 = 4
//        // 54 / 10 = 5
//
//        // 5 % 10 = 5
//        //5 / 10 = 0
//        return 0;
//    }
//
//    private static List<String> getCorrectNumbersList(List<String> stringList) {
//        Pattern pattern = Pattern.compile(correctNumberR);
//        return stringList.stream()
//                .filter(e -> pattern.matcher(e).matches())
//                .collect(Collectors.toList());
//    }
//
//    private static void printBalancedNumbers(List<String> numbers) {
//        //TODO
//        Pattern pattern = Pattern.compile(balanceNumberR);
//        long s = numbers.stream()
//                .filter(e -> {
//                    final Matcher matcher = pattern.matcher(e);
//                    matcher.find();
//                    return sumOf(matcher.group(1)) == sumOf(matcher.group(2));
//                })
//                .count();
//        System.out.println(s);
//    }
//
//    private static void printCompanyNumbers(List<String> strings) {
//        Pattern pattern = Pattern.compile(companyNumberR);
//        long count = strings.stream()
//                .filter(e -> pattern.matcher(e).matches())
//                .count();
//
//        System.out.println(count);
//    }
//
//    private static void printHappyNumbers(List<String> strings) {
//        Pattern pattern = Pattern.compile(happyNumberR);
//        long count = strings.stream()
//                .filter(e -> pattern.matcher(e).matches())
//                .count();
//
//        System.out.println(count);
//    }
//}
////
////    public static List<String> getAllNumbersFromFile() {
////        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("5_wprowadzenie_TWiwala_zad2.txt"))) {
////            return bufferedReader
////                    .lines()
////                    .collect(Collectors.toList());
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return List.of();
////    }
////}

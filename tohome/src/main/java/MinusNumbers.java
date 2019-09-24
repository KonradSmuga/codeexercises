
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinusNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>((Arrays.asList(3, 5, 10, 2, 1, 5, 8, 11, 12, 7)));

        System.out.println(math(numbers));
        PrimeNumbersStream primeNumbersStream = new PrimeNumbersStream();
        System.out.println(primeNumbersStream.primeNumbers(numbers));

        System.out.println(primeNumbersStream.sortedList(numbers));

        System.out.println(primeNumbersStream.powNumbers(numbers));

    }




    public static int math(List<Integer> numbers) {
        int minVal = numbers.stream()
                .mapToInt(Integer::intValue).min().getAsInt();

        int maxVal = numbers.stream()
                .mapToInt(Integer::intValue).max().getAsInt();

        return maxVal - minVal;
    }





}

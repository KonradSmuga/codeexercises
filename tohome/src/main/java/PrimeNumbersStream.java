import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbersStream {

    public List<Integer> primeNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(PrimeNumbersStream::isPrime)
                .collect(Collectors.toList());


    }

    public List<Double> powNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(e -> Math.sqrt(Math.round(e)))
                        .collect(Collectors.toList());
    }

    public List<Integer> sortedList(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

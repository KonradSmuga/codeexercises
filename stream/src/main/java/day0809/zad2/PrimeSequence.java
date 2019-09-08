package day0809.zad2;

public class PrimeSequence implements IntSequence {
    private int lastPrime = 1;
    private final int MAX_PRIME = 2000;

    @Override
    public int next() {
        lastPrime++;
        while (!isPrime(lastPrime)) {
            lastPrime++;
        }

        return lastPrime;
    }

    @Override
    public boolean hasNext() {
        int tmp = lastPrime++;
        while (!isPrime(tmp) && tmp < MAX_PRIME) {
            tmp++;
        }
        if (tmp > MAX_PRIME) {
            return false;
        }
        return true;
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
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

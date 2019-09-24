public class PrimeSequence implements IntSequence {
    private int lastPrime = 1;

    @Override
    public boolean hasNext() {
        int tmp = lastPrime++;
        while (!isPrime(tmp) && tmp < 2000) {
            tmp++;
        }
        return true;
    }

    @Override
    public int next() {

        lastPrime++;
        while (!isPrime(lastPrime)) {
            lastPrime++;
        }
        return lastPrime;
    }


    public boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i< n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


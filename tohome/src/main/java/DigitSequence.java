public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {

        int lastDigit;

        lastDigit = number % 10;
        number = number / 10;


        return lastDigit;

    }
}

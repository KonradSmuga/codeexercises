package day0809.zad2;

public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    public int next() {

        int sum = 0;

        sum += number % 10;
        number /= 10;

        return sum;
    }

    @Override
    public boolean hasNext() {
        return number!=0;
    }
}

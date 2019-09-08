package day0809.zad2;

public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    public int next() {
        int i;
        for (int a = 0; a < 10; a++) {

            i = number % 10;
            number /= 10;
        }
        return 0;
    }

}

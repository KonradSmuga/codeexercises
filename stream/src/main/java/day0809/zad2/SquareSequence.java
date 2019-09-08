package day0809.zad2;

public class SquareSequence implements IntSequence {
    private int square = 0;

    @Override
    public int next() {

        square++;

        return square * square;
    }
}

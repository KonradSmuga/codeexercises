package NumberChasing;

import java.util.ArrayList;
import java.util.Random;

public class Numbers {

    private int sumA;
    private int sumB;
    Random random = new Random();

    public Numbers(int sumA, int sumB) {
        this.sumA = sumA;
        this.sumB = sumB;
    }

    public int getSumA() {
        return sumA;
    }

    public int getSumB() {
        return sumB;
    }

    public void numberChasing(){
        while(sumA > sumB){
            int i = random.nextInt(9);
            int w = random.nextInt(49);
            sumA = sumA+i;
            System.out.println("liczba nr 1 wynosi" + sumA);
            sumB = sumB+w;
            System.out.println("liczba nr 2 wynosi" +sumB);
        }
    }
}

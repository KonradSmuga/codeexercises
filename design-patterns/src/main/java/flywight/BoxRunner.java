package flywight;

import java.util.Random;

public class BoxRunner {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            int width = random.nextBoolean() ? 3 : 7;
            int lenght = random.nextInt(8) + 5;
            int height = random.nextInt(4) + 2;


            Box box1 = BoxFactory.createBox(width, lenght, height);
        }


    }
}



package circleFlywight;

import java.util.Random;

public class CircleRunner {

    public static void main(String[] args) {

        Random random = new Random();


        for (int i = 0; i < 1_000_000; i++) {
            int circleRay = random.nextInt(8) + 2;
            int coordinateX = random.nextInt(5) + 1;
            int coordinateY = random.nextInt(5) + 1;
            Circle.Color color = Circle.Color.values()[random.nextInt(Circle.Color.values().length)];

            CircleFactory.createCircle(color, coordinateX, coordinateY, circleRay);
        }
    }
}

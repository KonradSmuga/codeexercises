package circleFlywight;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Circle {
    private final Color colors;
    private final int coordinateX;
    private final int coordinateY;
    private final int circleRay;
    private int counter = 0;

    public Circle(Color colors, int coordinateX, int coordinateY, int circleRay) {
        counter++;

        this.colors = colors;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.circleRay = circleRay;


        System.out.println(counter);
    }

    public  enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }
}

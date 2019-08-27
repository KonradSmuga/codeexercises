package circleFlywight;


import java.util.ArrayList;
import java.util.List;

public class CircleFactory {
    static List<Circle> circleList = new ArrayList<>();

    public static Circle createCircle(Circle.Color color, int coordinateX, int coordinateY, int circleRay) {
        //streamowo
        return circleList.stream()
                .filter(e -> e.getCircleRay() == circleRay && e.getColors() == color)
                .findAny()
                .orElseGet(() -> {

                    Circle circle = new Circle(color, coordinateX, coordinateY, circleRay);
                    circleList.add(circle);
                    return circle;


                });
        // nie streamowo
//        for (Circle circle : circleList) {
//            if (circle.getColors() == color && circle.getCircleRay() == circleRay)
//                circle.setCoordinateX(coordinateX);
//
//            circle.setCoordinateY(coordinateY);
//            return circle;
//        }
//
//        Circle circle = new Circle(color, coordinateX, coordinateY, circleRay);
//        circleList.add(circle);
//        return circle;

    }

}

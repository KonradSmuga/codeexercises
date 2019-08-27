import figure.Circle;
import figure.Drawer;
import figure.Triangle;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {

    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("rysuję koło", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("rysuję trójkąt", result);
    }
}


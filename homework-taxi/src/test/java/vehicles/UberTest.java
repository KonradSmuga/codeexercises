package vehicles;




import org.junit.jupiter.api.Test;
import vehicles.exceptions.WrongLocationException;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class UberTest {


    private static final boolean ANY_BOOLEAN =  true;

    @Test
    void shouldCounProperDistanceWhenStartAndEndLocationProvided() {

        //given
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Uber uber = new Uber(ANY_BOOLEAN, startPoint);
        double expectedDistance = 5.0;

        //when
        double actualDistance = 0;
        try {
            actualDistance = uber.countDistance(endPoint);
        } catch (WrongLocationException e) {
            fail("exception thrown");
        }
        System.out.println(actualDistance);
        //then
        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldThrowExceptonWhenUserLocationIsNegative() {
        //given
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Uber uber1 = new Uber(ANY_BOOLEAN, startPoint);
        double expectedDistance = 5.0;

        //when
        double actualDistance = 0;
        try {
            actualDistance = uber1.countDistance(endPoint);

        } catch (WrongLocationException e) {


        }
        //then
    }

    @Test
    void shouldReturnTimeWhenUserLocationProvided() {

        //given
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 5);
        Uber uber1 = new Uber(ANY_BOOLEAN, startPoint);
        double expectedTime = 0.4859126579037751;

        //when
        double destinationTime = uber1.timeToDestination(endPoint);

        //then
        assertEquals(expectedTime, destinationTime);

    }
}
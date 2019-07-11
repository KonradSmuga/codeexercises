package mathematic;

import com.sda.mathematic.FieldsFigures;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("ALL")
public class FieldFiguresTest {

    FieldsFigures fieldsFigures = new FieldsFigures();

    @Test
    public void shouldReturnExceptionIfSideIsZeroOnSquare() {
        //given

        int side = 0;
        //when and then
        assertThrows(IllegalArgumentException.class, () -> {
            fieldsFigures.fieldOfSquare(side);
        });
    }

    @Test
    public void shouldReturnCorrectValueOnSquareField() {
        //given
        double sideOfSquare = 4.0;
        //when
        double fieldOfSquare = fieldsFigures.fieldOfSquare(sideOfSquare);
        //then
        Assert.assertEquals(16.0, fieldOfSquare, 0);
    }

    @Test
    public void shouldReturnCorrectValueOnRectangleField() {
        //given
        double sideA = 4.0;
        double sideB = 5.0;
        //when
        double fieldOfRectangle = fieldsFigures.fieldOfRectangle(sideA, sideB);
        //then
        Assert.assertEquals(20.0, fieldOfRectangle, 0);
    }

    @Test
    public void shouldReturnCorrectValueOnParrarellField() {
        //given
        double sideA = 2.0;
        double height = 5.0;
        //when
        double fieldOfParallelogram = fieldsFigures.fieldOfParallelogram(sideA, height);
        //then
        Assert.assertEquals(10.0, fieldOfParallelogram, 0);
    }

    @Test
    public void shouldReturnCorrectValueOnDiamonField() {
        //given
        double sideA = 6.0;
        double height = 5.0;
        //when
        double fieldOfDiamond = fieldsFigures.fieldOfDiamond(sideA, height);
        //then
        Assert.assertEquals(30, fieldOfDiamond, 0);
    }

    @Test
    public void shouldReturnCorrectValueOnTriangleField() {
        //given
        double sideA = 6.0;
        double height = 5.0;
        //when
        double fieldOfTriangle = fieldsFigures.fieldOfTriangle(sideA, height);
        //then
        Assert.assertEquals(15, fieldOfTriangle, 0);
    }
}

package pl.sda.javawwa20.mockitolesson;

import org.junit.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbersExterminatorTest {

    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        if (result.isEmpty()) {
            System.out.println("Lista jest pusta");
        }

        //then
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList());

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
            //given
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //then
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(4,2));
        Assert.assertEquals(result,expectedResult );
}
}
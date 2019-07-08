import com.sda.testing.SimpleUser;
import org.junit.*;

public class TestingMain {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }


    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
}


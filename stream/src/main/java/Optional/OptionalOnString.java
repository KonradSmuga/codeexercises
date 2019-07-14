package Optional;


import java.util.Optional;
import java.util.Random;

public class OptionalOnString {

    public static Optional<String> getSomeValue() {
        Random random = new Random();
        return random.nextBoolean() ?
                Optional.empty() :
                Optional.of("some value");

    }
}


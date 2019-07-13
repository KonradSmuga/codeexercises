package interfaceexample.interfaces;

import java.math.BigDecimal;

public interface Rentable {

    String generateDescription();

    BigDecimal calculatePricePerMin(int minutes);
}

package interfaceexample;

import interfaceexample.interfaces.Rentable;

import java.math.BigDecimal;

public class Trailer implements Rentable {

    BigDecimal pricePerMinute;

    public Trailer(BigDecimal pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public BigDecimal getPricePerMinute() {
        return pricePerMinute;
    }

    public String generateDescription() {
        return "Trailer " +
                "pricePerMinute=" + pricePerMinute
                ;
    }

    @Override
    public BigDecimal calculatePricePerMin(int minutes) {
        return pricePerMinute.multiply(BigDecimal.valueOf(minutes));
    }
}

package interfaceexample;


import interfaceexample.interfaces.Rentable;

import java.math.BigDecimal;

public class RentService {


    public BigDecimal calculatePrice(Rentable rentable, int minutes) {
        BigDecimal totalprice = rentable.calculatePricePerMin(minutes);
        return totalprice;
    }

}

package interfaceexample;

import interfaceexample.interfaces.Rentable;

import java.math.BigDecimal;

public class Scooter implements Rentable {

    private String brand;
    private BigDecimal pricePerMin;

    public Scooter(String brand, BigDecimal pricePerMin) {
        this.brand = brand;
        this.pricePerMin = pricePerMin;
    }

    public Scooter(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPricePerMin() {
        return pricePerMin;
    }


    public String generateDescription() {
        return "Scooter{" +
                "brand='" + brand + '\'' +
                ", pricePerMin=" + pricePerMin +
                '}';
    }

    @Override
    public BigDecimal calculatePricePerMin(int minutes) {
        return pricePerMin.multiply(BigDecimal.valueOf(minutes));
    }
}

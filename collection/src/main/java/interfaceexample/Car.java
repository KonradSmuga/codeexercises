package interfaceexample;

import interfaceexample.interfaces.Rentable;

import java.math.BigDecimal;

public class Car implements Rentable {

    private String brand;
    private BigDecimal pricePerMinute;
    private int yearOfRelease;

    public Car(String brand, BigDecimal pricePerMinute, int yearOfRelease) {
        this.brand = brand;
        this.pricePerMinute = pricePerMinute;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPricePerMinute() {
        return pricePerMinute;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String generateDescription() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", pricePerMinute=" + pricePerMinute +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public BigDecimal calculatePricePerMin(int minutes) {
        return pricePerMinute.multiply(BigDecimal.valueOf(minutes));
    }
}

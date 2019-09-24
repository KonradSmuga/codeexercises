package world;

import java.math.BigDecimal;

public class Country {
    private String name;
    private BigDecimal peopleQuantiy;

    public Country(String name, BigDecimal peopleQuantiy) {
        this.name = name;
        this.peopleQuantiy = peopleQuantiy;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantiy() {
        return peopleQuantiy;
    }
}

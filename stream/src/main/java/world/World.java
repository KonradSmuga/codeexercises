package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(e -> e.getCountries().stream())
                .map(Country::getPeopleQuantiy)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

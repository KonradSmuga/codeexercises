package world;

import java.util.List;
import java.util.ArrayList;

public class Continent {
    private String continentName;
    private List<Country> countries;

    public Continent(String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}

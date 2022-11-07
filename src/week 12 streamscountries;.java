package streamscountries;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum Continent { ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, EUROPE, AUSTRALIA }

public class Country {
    private String name; // name of the country
    private String capital; // name of the capital city
    private Continent continent; // continent that the country is part of
    private int population; // population in thousands
    private boolean isLandlocked; // does not have access to the sea
    private int area; // area in square km

    public Country(String name, String capital, Continent continent,
            int population, boolean isLandlocked, int area) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.population = population;
        this.isLandlocked = isLandlocked;
        this.area = area;
    }

    public String getName() { return name; }
    public String getCapital() { return capital; }
    public Continent getContinent() { return continent; }
    public int getPopulation() { return population; }
    public boolean isLandlocked() { return isLandlocked; }
    public int getArea() { return area; }

    public void visit() {
        System.out.println("Hello from " + this.name + "!");
    }

    /**
     * Returns the number of landlocked countries in the given list.
     *
     * @param countries list of countries
     * @return number of landlocked countries
     */
    public static int numLandlocked(List<Country> countries) {
        // write your code here
        return (int) countries.stream().filter(c -> c.isLandlocked()).count();
    }

    /**
     * Returns a list of the names of the capital cities of all countries in
     * Africa or South America with populations greater than 20 million
     * (20,000,000).
     *
     * @param countries list of countries
     * @return list of capitals that meet the criteria
     */
    public static List<String> highPopulationCapitals(List<Country> countries) {
        // write your code here
        return countries.stream().filter(c -> ((c.getContinent().equals(Continent.SOUTH_AMERICA) ||
                                         c.getContinent().equals(Continent.AFRICA)) &&
                                          c.getPopulation() > 20000))
            .map(country -> country.getCapital())
            .collect(Collectors.toList());
    }

    /**
     * Returns a map of the given countries to their population densities.
     *
     * Population density is calculated as: 1000 * population / area, using
     * integer division.
     *
     * @param countries list of countries
     * @return map of countries to population density
     */
    public static Map<Country, Integer> populationDensities(
            List<Country> countries) {
        // write your code here
        return countries.stream().collect(Collectors.toMap(c -> c, c -> 1000 * c.getPopulation() / c.getArea()));
    }

    /**
     * Visits all of the given countries that are in the given continent, and
     * returns a list of their names.
     *
     * "Visiting" means that visit() should be called on each country.
     *
     * @param countries list of countries
     * @param continent continent containing countries to visit
     * @return names of countries visited
     */
    public static List<String> visitInContinent(List<Country> countries,
            Continent continent) {
        // write your code here
        return countries.stream()
            .filter(c -> c.getContinent().equals(continent))
            .peek(c -> c.visit())
            .map(country -> country.getName())
            .collect(Collectors.toList());
    }
}
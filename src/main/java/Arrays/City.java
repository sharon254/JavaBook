package Arrays;

import java.util.Objects;

public class City {

    private String name;
    private long population;


    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    // equality contracts: states that when you overwrite the equals you must also override the hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
}

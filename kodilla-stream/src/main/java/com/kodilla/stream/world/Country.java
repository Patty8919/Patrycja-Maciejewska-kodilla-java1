package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal people;

    public Country(String countryName, BigDecimal people) {
        this.countryName = countryName;
        this.people = people;
    }

    public Country(final String countryName) {
        this(countryName, new BigDecimal("1234569"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(people, country.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, people);
    }

    public BigDecimal getPeople() {
        return people;
    }
}

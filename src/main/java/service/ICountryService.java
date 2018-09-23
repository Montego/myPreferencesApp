package service;

import entity.Country;

import java.util.List;

public interface ICountryService {
    Country getCountry(String name);

    List<Country> getAllCountries();
}

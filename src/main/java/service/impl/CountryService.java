package service.impl;

import entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CountryRepository;
import service.ICountryService;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    private CountryRepository countryRepository;
    @Autowired
    public CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountry(String name) {
        return null;
    }

    @Override
    public List<Country> getAllCountries() {
        return null;
    }
}

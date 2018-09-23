package service.impl;

import entity.Item;
import entity.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RateRepository;
import service.IRateService;

import java.util.List;
@Service
public class RateService implements IRateService {

    private RateRepository rateRepository;
    @Autowired
    public RateService(RateRepository rateRepository){
        this.rateRepository = rateRepository;
    }

    @Override
    public List<Rate> getAllRates() {
        return null;
    }

    @Override
    public Rate getRate(Item item) {
        return null;
    }
}

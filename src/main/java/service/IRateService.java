package service;

import entity.Item;
import entity.Rate;

import java.util.List;

public interface IRateService {
    List<Rate> getAllRates();
    Rate getRate(Item item);
}

package repository;

import entity.Item;
import entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RateRepository extends JpaRepository<Rate, Long> {
    List<Rate> findByRateKinogo(float rateKinogo);
    List<Rate> findByRateOMDb(float rateOMDb);
    List<Rate> findByRateOwn(float rateOwn);
}

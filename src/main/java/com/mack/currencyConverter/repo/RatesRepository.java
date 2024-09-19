package com.mack.currencyConverter.repo;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.data.Rates;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Bhagwat Kolte
 */
public interface RatesRepository extends CrudRepository<Rates, Integer> {
    Rates findByRateID(Long id);

    Rates findByCurrencyID(Long currencyID);
}

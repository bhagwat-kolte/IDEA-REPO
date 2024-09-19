package com.mack.currencyConverter.repo;

import com.mack.currencyConverter.data.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Bhagwat Kolte
 */
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    Currency findByCurrencyID(Long id);
    List<Currency> findByCountryCode(String countryCode);

    List<Currency> findByCountryName(String countryName);

    List<Currency> findByCurrencyName(String currencyName);

    List<Currency> findByCurrencyCode(String currencyCode);
}

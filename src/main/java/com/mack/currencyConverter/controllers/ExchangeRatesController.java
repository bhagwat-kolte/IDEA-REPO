package com.mack.currencyConverter.controllers;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.data.Rates;
import com.mack.currencyConverter.repo.RatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bhagwat Kolte
 */

@RestController
@RequestMapping("/rate")
public class ExchangeRatesController {

    @Autowired
    private RatesRepository repository;

    @GetMapping("/{id}")
    public Rates getCurrencyExchangeRate(@PathVariable Long id) {
        return repository.findByRateID(id);
    }

    @GetMapping("/all")
    public List<Rates> getAllCurrencies() {
        return (List<Rates>) repository.findAll();
    }
}

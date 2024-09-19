package com.mack.currencyConverter.controllers;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.repo.CurrencyRepository;
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
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyRepository repository;

    @GetMapping("/{id}")
    public Currency getCurrency(@PathVariable Long id) {
        return repository.findByCurrencyID(id);
    }

    @GetMapping("/all")
    public List<Currency> getAllCurrencies() {
        return (List<Currency>) repository.findAll();
    }

    @GetMapping("/countryCode/all")
    public List<Currency> getAllCurrenciesByCountryCode(@PathVariable String countryCode) {
        return (List<Currency>) repository.findByCountryCode(countryCode);
    }

    @GetMapping("/countryName/all")
    public List<Currency> getAllCurrenciesByCountryName(@PathVariable String countryName) {
        return (List<Currency>) repository.findByCountryName(countryName);
    }

    @GetMapping("/currencyCode/all")
    public List<Currency> getAllCurrenciesByCurrencyCode(@PathVariable String currencyCode) {
        return (List<Currency>) repository.findByCurrencyCode(currencyCode);
    }

    @GetMapping("/currencyName/all")
    public List<Currency> getAllCurrenciesByCurrencyName(@PathVariable String currencyName) {
        return (List<Currency>) repository.findByCurrencyName(currencyName);
    }


}

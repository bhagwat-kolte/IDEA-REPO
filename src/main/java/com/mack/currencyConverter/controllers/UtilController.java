package com.mack.currencyConverter.controllers;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.data.Rates;
import com.mack.currencyConverter.repo.CurrencyRepository;
import com.mack.currencyConverter.repo.RatesRepository;
import com.mack.currencyConverter.util.LoadExcelData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bhagwat Kolte
 */

@RestController
public class UtilController {

    @Autowired
    private CurrencyRepository repository;

    @Autowired
    private RatesRepository ratesRepository;

    @GetMapping("/util")
    public String loadDataToDB() throws IOException {
        LoadExcelData excelData =  new LoadExcelData();
        List<Currency> list = new ArrayList<>();
        list = excelData.readExcelData();

        if (!list.isEmpty() && list != null){
            list.forEach(curr -> repository.save(curr));
        }
        return "SUCCESS";
    }

    @GetMapping("/rate")
    public String loadRatesToDB() throws IOException {
        LoadExcelData excelData =  new LoadExcelData();
        List<Currency> currency = new ArrayList<>();
        List<Rates> rates =  new ArrayList<>();
        currency = (List<Currency>) repository.findAll();
        rates = excelData.readExcelDataForExchangeRates(currency);

        rates.stream().sorted();

        if (!rates.isEmpty() && rates != null) {
            rates.forEach(rate -> {
                ratesRepository.save(rate);
            });
        }
        return "SUCCESS";
    }
}

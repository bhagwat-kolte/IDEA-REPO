package com.mack.currencyConverter.service;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.data.Rates;
import com.mack.currencyConverter.repo.CurrencyRepository;
import com.mack.currencyConverter.repo.RatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bhagwat Kolte
 */
@Service
public class CurrencyConvertorServiceImpl implements CurrencyConvertorService{

    @Autowired
    private CurrencyRepository repository;

    @Autowired
    private RatesRepository ratesRepository;



    /**
     * @param fromCurrency
     * @param toCurrency
     * @return
     */
    @Override
    public String convertAmountByCurrencyCode(Double amount, String fromCurrency, String toCurrency) {

        List<Currency> list = repository.findAll();
        Rates rate1 = new Rates();
        Rates rate2 = new Rates();
        Currency currency1 = new Currency();
        Currency currency2 = new Currency();

        for (Currency currency : list) {
            if (currency.getCurrencyCode().equalsIgnoreCase(fromCurrency)) {
                rate1 = ratesRepository.findByCurrencyID(currency.getCurrencyID());
                currency1 = currency;
            }
        }

        for (Currency currency : list) {
            if (currency.getCurrencyCode().equalsIgnoreCase(toCurrency)) {
                rate2 = ratesRepository.findByCurrencyID(currency.getCurrencyID());
                currency2 = currency;
            }
        }

        Double finalRate = Double.parseDouble(rate1.getRate()) / Double.parseDouble(rate2.getRate());

        Double finalAmount = amount * finalRate;
        String str = "Amount " + currency1.getCurrencyCode() + amount +" = " + currency1.getCurrencyCode() + finalAmount;
        return str;
    }
}

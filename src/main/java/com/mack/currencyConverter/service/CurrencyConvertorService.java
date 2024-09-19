package com.mack.currencyConverter.service;

/**
 * @author Bhagwat Kolte
 */
public interface CurrencyConvertorService {
    public String convertAmountByCurrencyCode(Double amount, String fromCurrency, String toCurrency);
}

package com.mack.currencyConverter.controllers;

import com.mack.currencyConverter.service.CurrencyConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bhagwat Kolte
 */

@RestController
@RequestMapping("/convert/amount/")
public class ConverterController {

    @Autowired
    private CurrencyConvertorService convertorService;

    @GetMapping("/currencyCode")
    public String convertAmountByCurrencyCode(@PathVariable Double amount, @PathVariable String fromCurrency, @PathVariable String toCurrency) {

        String str = convertorService.convertAmountByCurrencyCode(amount, fromCurrency, toCurrency);
        return str;
    }
}

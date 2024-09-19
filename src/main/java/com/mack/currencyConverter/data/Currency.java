package com.mack.currencyConverter.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Bhagwat Kolte
 */

@Entity
public class Currency {

    @Id
    private Long currencyID;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "currency_code")
    private String currencyCode;

    public Currency(Long currencyID, String countryCode, String countryName, String currencyName, String currencyCode) {
        this.currencyID = currencyID;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
    }

    public Currency() {
    }

    public Long getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Long currencyID) {
        this.currencyID = currencyID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "CurrencyBean{" +
                "currencyID=" + currencyID +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }
}

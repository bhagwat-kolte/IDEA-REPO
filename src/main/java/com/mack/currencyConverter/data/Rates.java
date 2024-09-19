package com.mack.currencyConverter.data;

import jakarta.persistence.*;

/**
 * @author Bhagwat Kolte
 */

@Entity
public class Rates {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long rateID;

    @Column(name = "rate")
    private String rate;

    @Column(name = "currencyID")
    private Long currencyID;

    public Rates(Long rateID, String rate, Long currencyID) {
        this.rateID = rateID;
        this.rate = rate;
        this.currencyID = currencyID;
    }

    public Rates() {
    }

    public Long getRateID() {
        return rateID;
    }

    public void setRateID(Long rateID) {
        this.rateID = rateID;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Long getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Long currencyID) {
        this.currencyID = currencyID;
    }

    @Override
    public String toString() {
        return "Rates{" +
                "rateID=" + rateID +
                ", rate='" + rate + '\'' +
                ", currencyID=" + currencyID +
                '}';
    }
}

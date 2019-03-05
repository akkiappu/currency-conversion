package model;

import constants.Currencies;

public class CurrencyConversion {
    private final Currencies base;
    private final Currencies terms;
    private final String amount;

    public CurrencyConversion(Currencies base, Currencies terms, String amount) {
        this.base = base;
        this.terms = terms;
        this.amount = amount;
    }

    public Currencies getBase() {
        return base;
    }

    public Currencies getTerms() {
        return terms;
    }

    public Double getAmount() {
        return Double.parseDouble(amount);
    }

    public String getAmountInString() {
        return amount;
    }
}

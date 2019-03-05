package service;

import constants.Currencies;

public interface FormatterService {
    String formatOutputAsPerCurrency(String actualAmount, Double convertedAmount, Currencies ccy1, Currencies ccy2);
}

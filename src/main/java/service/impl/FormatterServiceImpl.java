package service.impl;

import service.FormatterService;
import constants.Currencies;
import constants.CurrencyPrecisionFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormatterServiceImpl implements FormatterService {
    @Override
    public String formatOutputAsPerCurrency(String actualAmount, Double convertedAmount, Currencies ccy1, Currencies ccy2) {
        convertedAmount = (new BigDecimal(convertedAmount).setScale(CurrencyPrecisionFormat.valueOf(ccy2.name()).precision, RoundingMode.HALF_EVEN)).doubleValue();
        return ccy1 + " " + actualAmount + " = " + ccy2 + " " + convertedAmount;
    }
}

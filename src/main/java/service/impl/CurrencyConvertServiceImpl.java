package service.impl;

import constants.Currencies;
import model.CurrencyConversion;
import service.CurrencyConvertService;
import constants.Constants;

import java.util.Map;

public class CurrencyConvertServiceImpl implements CurrencyConvertService {
    private String[][] crossCurrencyTable;
    private Map<String, Double> exchangeRates;

    public CurrencyConvertServiceImpl(String[][] crossCurrencyTable, Map<String, Double> exchangeRates) {
        this.crossCurrencyTable = crossCurrencyTable;
        this.exchangeRates = exchangeRates;
    }

    @Override
    public double convert(CurrencyConversion conversionModel) {
        return calculate(conversionModel.getBase(), conversionModel.getTerms(), conversionModel.getAmount());
    }

    private Double calculate(Currencies base, Currencies term, Double amount) {

        String crossMatrixResult = crossCurrencyTable[base.ordinal()][term.ordinal()];

        if (crossMatrixResult.equals(Constants.DIRECT)) {
            return calculateDirectRate(base, term, amount);
        } else if (crossMatrixResult.equals(Constants.INVERSE)) {
            return calculateInverseRate(base, term, amount);
        } else if (crossMatrixResult.equals(Constants.SAME_CURRENCY)) {
            return amount;
        } else {
            amount = calculate(base, Currencies.valueOf(crossMatrixResult), amount);
            return calculate(Currencies.valueOf(crossMatrixResult), term, amount);
        }

    }


    private Double calculateDirectRate(Currencies base, Currencies term, Double amount) {
        return exchangeRates.get(base.name() + term.name()) * amount;
    }

    private Double calculateInverseRate(Currencies base, Currencies term, Double amount) {
        return (1 / exchangeRates.get(term.name() + base.name())) * amount;
    }

}

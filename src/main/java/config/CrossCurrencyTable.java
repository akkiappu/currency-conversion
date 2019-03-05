package config;

import constants.Currencies;
import constants.Constants;

public class CrossCurrencyTable {
    static String[][] table = null;

    public static String[][] build() {

        if (table == null) {
            table = new String[Currencies.values().length][Currencies.values().length];
            int i = 0, j = 0;

            //AUD
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //CAD
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //CNY
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //CZK
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            i++;
            j = 0;

            //DKK
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            i++;
            j = 0;

            //EUR
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            table[i][j++] = Constants.DIRECT;
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //GBP
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //JPY
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.INVERSE;
            i++;
            j = 0;

            //NOK
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.EUR.name();
            i++;
            j = 0;

            //NZD
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Currencies.USD.name();
            table[i][j++] = Constants.SAME_CURRENCY;
            table[i][j++] = Constants.DIRECT;
            i++;
            j = 0;

            //USD
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Constants.DIRECT;
            table[i][j++] = Currencies.EUR.name();
            table[i][j++] = Constants.INVERSE;
            table[i][j++] = Constants.SAME_CURRENCY;
        }
        return table;
    }
}

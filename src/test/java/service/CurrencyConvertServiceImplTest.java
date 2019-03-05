package service;

import model.CurrencyConversion;
import org.junit.Test;
import service.impl.CurrencyConvertServiceImpl;
import config.CrossCurrencyTable;
import constants.Currencies;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CurrencyConvertServiceImplTest {

    @Test
    public void testConvert_AUDToUSD(){
        //given
        CurrencyConversion conversionModel = mock(CurrencyConversion.class);
        when(conversionModel.getBase()).thenReturn(Currencies.AUD);
        when(conversionModel.getTerms()).thenReturn(Currencies.USD);
        when(conversionModel.getAmount()).thenReturn(100.00d);

        CurrencyConvertService testClass = new CurrencyConvertServiceImpl(CrossCurrencyTable.build(),getCurrencyExchangeRate());

        //when
        Double output = testClass.convert(conversionModel);

        //then
        assertEquals(output,83.71);
    }

    @Test
    public void testConvert_WithSameCurrency_AUDToAUD(){
        //given
        CurrencyConversion conversionModel = mock(CurrencyConversion.class);
        when(conversionModel.getBase()).thenReturn(Currencies.AUD);
        when(conversionModel.getTerms()).thenReturn(Currencies.AUD);
        when(conversionModel.getAmount()).thenReturn(100.00d);

        CurrencyConvertService testClass = new CurrencyConvertServiceImpl(CrossCurrencyTable.build(),getCurrencyExchangeRate());

        //when
        Double output = testClass.convert(conversionModel);

        //then
        assertEquals(output,100.00d);
    }

    @Test
    public void testConvert_AUDToDKK(){
        //given
        CurrencyConversion conversionModel = mock(CurrencyConversion.class);
        when(conversionModel.getBase()).thenReturn(Currencies.AUD);
        when(conversionModel.getTerms()).thenReturn(Currencies.DKK);
        when(conversionModel.getAmount()).thenReturn(100.00d);

        CurrencyConvertService testClass = new CurrencyConvertServiceImpl(CrossCurrencyTable.build(),getCurrencyExchangeRate());

        //when
        Double output = testClass.convert(conversionModel);

        //then
        DecimalFormat df = new DecimalFormat(".##");
        assertEquals(df.format(output),String.valueOf(505.76d));
    }


    @Test
    public void testConvert_JPYToUSD(){
        //given
        CurrencyConversion conversionModel = mock(CurrencyConversion.class);
        when(conversionModel.getBase()).thenReturn(Currencies.JPY);
        when(conversionModel.getTerms()).thenReturn(Currencies.USD);
        when(conversionModel.getAmount()).thenReturn(100.00d);

        CurrencyConvertService testClass = new CurrencyConvertServiceImpl(CrossCurrencyTable.build(),getCurrencyExchangeRate());

        //when
        Double output = testClass.convert(conversionModel);

        //then
        DecimalFormat df = new DecimalFormat("0.##");
        assertEquals(df.format(output),String.valueOf(.83d));
    }

    @Test
    public void testConvert_AUDToJPY(){
        //given
        CurrencyConversion conversionModel = mock(CurrencyConversion.class);
        when(conversionModel.getBase()).thenReturn(Currencies.AUD);
        when(conversionModel.getTerms()).thenReturn(Currencies.JPY);
        when(conversionModel.getAmount()).thenReturn(1d);

        CurrencyConvertService testClass = new CurrencyConvertServiceImpl(CrossCurrencyTable.build(),getCurrencyExchangeRate());

        //when
        int output = (int)testClass.convert(conversionModel);

        //then
        assertEquals(output,100);
    }

    public Map<String, Double> getCurrencyExchangeRate(){
        Map<String,Double> exchangeMap = new HashMap<>();
        exchangeMap.put("AUDUSD",0.8371);
        exchangeMap.put("CADUSD",0.8711);
        exchangeMap.put("USDCNY",6.1715);
        exchangeMap.put("EURUSD",1.2315);
        exchangeMap.put("GBPUSD",1.5683);
        exchangeMap.put("NZDUSD",0.7750);
        exchangeMap.put("USDJPY",119.95);
        exchangeMap.put("EURCZK",27.6028);
        exchangeMap.put("EURDKK",7.4405);
        exchangeMap.put("EURNOK",8.6651);
        return exchangeMap;
    }
}

package service;

import org.junit.Test;
import service.impl.FormatterServiceImpl;
import constants.Currencies;

import static junit.framework.TestCase.assertEquals;

public class FormatterServiceImplTest {
    @Test
    public void testFormatOutputAsPerCurrency(){

        //given
        FormatterService testClass = new FormatterServiceImpl();

        //when
        String output = testClass.formatOutputAsPerCurrency("100.00",505.76,Currencies.AUD,Currencies.DKK);

        //then
        assertEquals(output,"AUD 100.00 = DKK 505.76");

    }

    @Test
    public void testFormatOutputForJPY(){

        //given
        FormatterService testClass = new FormatterServiceImpl();

        //when
        String output = testClass.formatOutputAsPerCurrency("101.50",10192.76,Currencies.AUD,Currencies.JPY);

        //then
        assertEquals(output,"AUD 101.50 = JPY 10193.0");

    }
}

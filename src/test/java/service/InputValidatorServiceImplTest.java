package service;

import model.ValidationResult;
import org.junit.Test;
import service.impl.InputValidatorServiceImpl;

import static junit.framework.TestCase.assertEquals;

public class InputValidatorServiceImplTest {
    @Test
    public void testValidate_NoInput(){
        //given
        InputValidatorService testClass = new InputValidatorServiceImpl();

        //when
        ValidationResult result = testClass.validate("");

        //then
        assertEquals(result.getMessage(),"No input entered");
    }

    @Test
    public void testValidate_InvalidInput(){
        //given
        InputValidatorService testClass = new InputValidatorServiceImpl();

        //when
        ValidationResult result = testClass.validate("ABC 123 234");

        //then
        assertEquals(result.getMessage(),"Invalid input");
    }

    @Test
    public void testValidate_InvalidCurrency(){
        //given
        InputValidatorService testClass = new InputValidatorServiceImpl();

        //when
        ValidationResult result = testClass.validate("KRW 1000.00 in FJD");

        //then
        assertEquals(result.getMessage(),"Unable to find rate for KRW/FJD");
    }

    @Test
    public void testValidate_InvalidAmount(){
        //given
        InputValidatorService testClass = new InputValidatorServiceImpl();

        //when
        ValidationResult result = testClass.validate("AUD 00.00 in USD");

        //then
        assertEquals(result.getMessage(),"Invalid amount entered");
    }

    @Test
    public void testValidate_NegativedAmount(){
        //given
        InputValidatorService testClass = new InputValidatorServiceImpl();

        //when
        ValidationResult result = testClass.validate("AUD -100.00 in USD");

        //then
        assertEquals(result.getMessage(),"Invalid amount entered");
    }
}



package view;

import model.CurrencyConversion;
import model.ValidationResult;
import service.CurrencyConvertService;
import service.FormatterService;
import service.InputValidatorService;
import constants.Currencies;

import java.util.Scanner;

public class Console {
    private CurrencyConvertService currencyConverterService;
    private InputValidatorService inputValidatorService;
    private FormatterService outputFormatterService;

    public Console(CurrencyConvertService currencyConverterService, InputValidatorService inputValidatorService, FormatterService outputFormatterService) {
        this.currencyConverterService = currencyConverterService;
        this.inputValidatorService = inputValidatorService;
        this.outputFormatterService = outputFormatterService;
    }

    public void console() {
        System.out.println("Enter input in the format \"<ccy1> <amount1> in <ccy2>\"");
        String input = keyBoard();
        while(!input.equals("EXIT")){
            ValidationResult result = inputValidatorService.validate(input);
            if(result.getMessage().equals("SUCCESS")){
                CurrencyConversion model = buildModel(input);
                Double convertedAmount = currencyConverterService.convert(model);
                String output = outputFormatterService.formatOutputAsPerCurrency
                        (model.getAmountInString(),convertedAmount,model.getBase(),model.getTerms());
                printOutput(output);
            } else{
                printError(result.getMessage());
            }
            input = keyBoard();
        }
    }
    private String keyBoard(){
        Scanner in = null;
        if(in == null){
            in = new Scanner(System.in);
        }
        return in.nextLine().trim().toUpperCase();
    }

    private CurrencyConversion buildModel(String input){
        String[] inputToken = input.trim().split("\\s+");
        return new CurrencyConversion(Currencies.valueOf(inputToken[0]), Currencies.valueOf(inputToken[3]), inputToken[1]);
    }

    private void printError(String errorMessage){
        System.err.println(errorMessage);
    }
    private void printOutput(String output){
        System.out.println(output);
    }
}

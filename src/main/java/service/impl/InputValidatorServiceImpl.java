package service.impl;

import constants.Currencies;
import model.ValidationResult;
import service.InputValidatorService;

public class InputValidatorServiceImpl implements InputValidatorService {
    @Override
    public ValidationResult validate(String input) {
        ValidationResult result = new ValidationResult();
        if (input.isEmpty()) {
            result.setMessage("No input entered");
            return result;
        }

        String[] inputToken = input.trim().split("\\s+");
        if (inputToken.length != 4 && !inputToken[2].equalsIgnoreCase("IN")) {
            result.setMessage("Invalid input");
            return result;
        }

        try {
            Currencies.valueOf(inputToken[0]);
            Currencies.valueOf(inputToken[3]);
        } catch (Exception e) {
            result.setMessage("Unable to find rate for "+inputToken[0]+"/"+inputToken[3]);
            return result;
        }

        try {
            if(Double.parseDouble(inputToken[1]) <= 0d){
                throw new Exception();
            }
        } catch (Exception ex) {
            result.setMessage("Invalid amount entered");
            return result;
        }

        result.setMessage("SUCCESS");

        return result;
    }

}

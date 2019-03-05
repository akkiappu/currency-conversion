package service;

import model.ValidationResult;

public interface InputValidatorService {
    ValidationResult validate(String input);
}

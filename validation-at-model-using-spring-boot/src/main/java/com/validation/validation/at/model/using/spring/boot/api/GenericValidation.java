package com.validation.validation.at.model.using.spring.boot.api;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.List;

@Component
public class GenericValidation {
    public String getValidationMessageOnBindingResult(BindingResult bindingResult) {
        System.out.println("errorMsg 123 ");
        List<ObjectError> errors = bindingResult.getAllErrors();
        FieldError tester = null;
        if (errors.get(0) instanceof FieldError) {
            tester = (FieldError) errors.get(0);
        }
        // String errorMsg = tester.getField().toString();
        String errorMsg = tester.getDefaultMessage().toString();
        System.out.println("errorMsg " + errorMsg);
        return errorMsg;
    }
}

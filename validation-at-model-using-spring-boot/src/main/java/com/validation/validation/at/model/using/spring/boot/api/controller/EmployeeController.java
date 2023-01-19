package com.validation.validation.at.model.using.spring.boot.api.controller;

import com.validation.validation.at.model.using.spring.boot.api.GenericValidation;
import com.validation.validation.at.model.using.spring.boot.api.model.EmployeeModel;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController {
    private GenericValidation genericValidation;

    public EmployeeController(GenericValidation genericValidation) {
        this.genericValidation = genericValidation;
    }

    @PostMapping("/api/test")
    public String employeeValidation(@Valid @RequestBody EmployeeModel employeeModel, BindingResult result) {
        if (result.hasErrors()) {
            return new String(genericValidation.getValidationMessageOnBindingResult(result));
        }
        return "Response done";
    }
}

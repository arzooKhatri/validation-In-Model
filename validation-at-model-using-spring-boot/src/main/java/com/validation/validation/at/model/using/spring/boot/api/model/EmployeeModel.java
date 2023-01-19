package com.validation.validation.at.model.using.spring.boot.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.math.BigDecimal;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeModel {
    @NotBlank(message = "employeeName: cannot be blank or null ")
    private String employeeName;

    @NotBlank(message = "employeeAddress: can not be null ")
    @Size(min = 2, message = "employeeAddress :minimum 2 size required")
    @Size(max = 20, message = "employeeAddress : maximum 20 Size allowed")
    private String employeeAddress;

    //@Digits(integer = 2, fraction = 0, message = " employeeId : limit allow = 2")
    @DecimalMin(value = "1", inclusive = false, message = " employeeId : min value = 1")
    @DecimalMax(value = "5", inclusive = false, message = " employeeId : max value = 5")
    public int employeeId;

    @Digits(integer = 2, fraction = 0, message = " employeeSalary : limit allow = 2")
    @DecimalMin(value = "1", inclusive = false, message = "employeeSalary : min value = 1")
    @DecimalMax(value = "5", inclusive = false, message = " employeeSalary : max value = 5")
    public long employeeSalary;

    @AssertTrue(message = "isEmployeeAciveTrue: must be true")
    private boolean isEmployeeAciveTrue;

    @AssertFalse(message = "isEmployeeAciveFalse: must be false")
    private boolean isEmployeeAciveFalse;

    @Email(message = "employeeEmail:  should be valid")
    @NotEmpty(message = "employeeEmail : Should Not be empty")
    private String employeeEmail;

    @Min(value = (long) 1D, message = "employeeCtc ::minimum 1 value required")
    @Max(value = (long) 5D, message = "employeeCtc ::maximum 5 value allowed")
    private Double employeeCtc;

    @Digits(integer = 2, fraction = 2, message = " employeePF : allowed integer = 2 , fraction = 2")
    @DecimalMin(value = "1", inclusive = false, message = "employeePF : min value allow = 1")
    @DecimalMax(value = "555", inclusive = false, message = " employeePF : max value allow = 555")
    public BigDecimal employeePF;
}

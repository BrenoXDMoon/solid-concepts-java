package br.com.brenoxdmoon.solidconcepts.core.domain.entity;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Setter
public class Employee {

    private Integer id;
    private String designation;
    private String name;
    private String email;
    private BigDecimal salary;

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public void updateSalary(BigDecimal newSalary) {
        if (newSalary != null) {
            this.setSalary(newSalary);
        }
    }
}

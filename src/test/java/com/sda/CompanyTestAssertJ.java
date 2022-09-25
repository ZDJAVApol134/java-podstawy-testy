package com.sda;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CompanyTestAssertJ {

    private Company company;

    @BeforeEach
    void setUp() {
        company = new Company(1, "SDA");
    }

    @Test
    void testAddEmployee() {
        // give
        Employee expectedEmployee = new Employee();

        // when
        company.addEmployee(expectedEmployee);

        // then
        List<Employee> employeeList = company.getEmployeeList();
        Employee actualEmployee = employeeList.get(0);

        Assertions.assertThat(employeeList)
                .hasSize(1)
                .contains(actualEmployee);

        Assertions.assertThat(actualEmployee)
                .isEqualTo(expectedEmployee)
                .asString()
                .isEqualTo(actualEmployee.toString());

    }

}
package com.sda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CompanyTest {

    private Company company;

    @BeforeEach
    void setUp() {
        company = new Company(1, "SDA");
        System.out.println("@BeforeEach: " + company);
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach: " + company);
    }

    @Test
    void testAddEmployee() {
        // give
        Employee expectedEmployee = new Employee();
        company.setId(5);
        company.setName("Janusz Soft");

        // when
        company.addEmployee(expectedEmployee);

        // then
        List<Employee> employeeList = company.getEmployeeList();
        int size = employeeList.size();
        Employee actualEmployee = employeeList.get(0);

        Assertions.assertNotNull(employeeList);
        Assertions.assertEquals(1, size);
        Assertions.assertNotNull(actualEmployee);
        Assertions.assertEquals(expectedEmployee, actualEmployee);
    }


    @Test
    void test2() {
        // give
        Employee expectedEmployee = new Employee();
        company.setId(8);

        // when
        company.addEmployee(expectedEmployee);

        // then
        Assertions.assertEquals(1, company.getEmployeeList().size());
    }


    @Test
    void test3() {
        company.setId(8);
    }

    @Test
    void test4() {
        company.setId(10);
    }
}
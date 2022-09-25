package com.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private int id;
    private String name;
    private List<Employee> employeeList;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee) {
        return employeeList.add(employee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return id == company.id && Objects.equals(name, company.name) && Objects.equals(employeeList, company.employeeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employeeList);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}

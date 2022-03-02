package Homework_20220301.accounting;

import Homework_20220301.accounting.Accounting;

public class TaxAccounting extends Accounting {
    private int countOfEmployees;
    private String departmentName;

    public TaxAccounting() {
    }

    public TaxAccounting(int countOfEmployees, String departmentName) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
    }

    @Override
    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    @Override
    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public int account() {
        return this.countOfEmployees * 5000 + this.countOfEmployees * 1500;
    }
}

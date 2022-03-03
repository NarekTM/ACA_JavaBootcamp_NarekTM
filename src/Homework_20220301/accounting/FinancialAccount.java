package Homework_20220301.accounting;

public class FinancialAccount extends TaxAccounting {
    protected int countOfEmployees;
    private String departmentName;

    public FinancialAccount() {
    }

    public FinancialAccount(int countOfEmployees, String departmentName) {
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
        return this.countOfEmployees * 750_000;
    }
}

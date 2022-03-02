package Homework_20220301.itCompany;

public class FinancialAccount extends TaxAccounting {

    public FinancialAccount() {
    }

    public FinancialAccount(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public Integer account() {
        return getCountOfEmployers() * 870_000;
    }
}

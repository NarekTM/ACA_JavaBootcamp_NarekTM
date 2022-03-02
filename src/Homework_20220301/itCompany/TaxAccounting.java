package Homework_20220301.itCompany;

public class TaxAccounting extends Accounting {

    public TaxAccounting() {
    }

    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public Integer account() {
        return this.getCountOfEmployers() * 5000;
    }
}

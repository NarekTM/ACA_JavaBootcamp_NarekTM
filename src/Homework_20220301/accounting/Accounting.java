package Homework_20220301.accounting;

public class Accounting {
    protected int countOfEmployees;
    protected String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployees, String departmentName) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int account() {
        return this.countOfEmployees * 5000;
    }
}

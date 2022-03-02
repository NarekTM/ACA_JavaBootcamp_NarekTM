package Homework_20220301.itCompany;

public class SMM extends Marketing {
    public SMM() {
    }

    public SMM(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("Do " + this.getDepartmentName() + "!");
    }
}

package Homework_20220301.itCompany;

public class SEO extends Marketing {
    public SEO() {
    }

    public SEO(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("Do " + this.getDepartmentName() + "!");
    }
}

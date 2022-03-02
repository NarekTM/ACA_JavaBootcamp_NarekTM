package Homework_20220301.itCompany;

public class Accounting extends ItCompany {
    private String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public Integer account() {
        return this.getCountOfEmployers() / 2;
    }
}

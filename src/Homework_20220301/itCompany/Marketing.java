package Homework_20220301.itCompany;

public class Marketing extends ItCompany {
    protected String departmentName;

    public Marketing() {
    }

    public Marketing(int countOfEmployers, String departmentName) {
        super(countOfEmployers);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void marketing() {
        System.out.println("Do " + departmentName + "!");
    }


}

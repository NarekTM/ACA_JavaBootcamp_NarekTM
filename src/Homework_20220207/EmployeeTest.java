package Homework_20220207;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee mEmp1 = new Employee("m01AB", "Jacob", "Accounting", 27, "male");
        Employee mEmp2 = new Employee("m02AB", "Chris", "Accounting", 38, "male");
        Employee mEmp3 = new Employee("w03DB", "Patrick", "Development", 25, "male");
        Employee wEmp1 = new Employee("w01AB", "Yelena", "Accounting", 30, "female");
        Employee wEmp2 = new Employee("w02MB", "Amanda", "Marketing", 24, "female");

        mEmp1.printAllInfo();
        mEmp2.printAllInfo();
        mEmp3.printAllInfo();
        wEmp1.printAllInfo();
        wEmp2.printAllInfo();
    }
}

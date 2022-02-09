package Homework_20220207;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee mEmp1 = new Employee(000014, "Jacob", "Sallivan", 30, "Development", 264000, 'm');
        Employee mEmp2 = new Employee(000023, "Chris", "Brown", 38, "Accounting", 85000, 'm');
        Employee mEmp3 = new Employee(000052, "Patrick", "Gardner", 25, "Development", 120000, 'm');
        Employee wEmp1 = new Employee(000031, "Yelena", "Markova", 27, "Development", 150000, 'm');
        Employee wEmp2 = new Employee(000045, "Amanda", "Bush", 24, "Marketing", 70000, 'f');

        mEmp1.printAllInfo();
        mEmp2.printAllInfo();
        mEmp3.printAllInfo();
        wEmp1.printAllInfo();
        wEmp2.printAllInfo();

        System.out.println("Count of Employee objects: " + Employee.count);
    }
}

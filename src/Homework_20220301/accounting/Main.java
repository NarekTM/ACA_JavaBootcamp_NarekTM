package Homework_20220301.accounting;

public class Main {
    public static void main(String[] args) {
        Accounting accounting = new Accounting(10, "Marketing");
        System.out.println("Only income tax of company is: " + accounting.account());

        TaxAccounting taxAccounting = new TaxAccounting(50, "IT");
        System.out.println("Taxes of company are: " + taxAccounting.account());

        FinancialAccount financialAccount = new FinancialAccount(20, "Development");
        System.out.println("Amount salary of employees is: " + financialAccount.account());
    }
}

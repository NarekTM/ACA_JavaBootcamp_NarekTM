package Homework_20220301.itCompany;

public class Main {
    public static void main(String[] args) {
        ItCompany itCompany = new ItCompany(50, "ServiceTitan");
        System.out.println("Our vision for employees count is: " + itCompany.account() + ". " + itCompany.getCompanyName());

        Accounting accounting = new Accounting(50, "Accounting");
        System.out.println("Half of count of our employees is: " + accounting.account());

        TaxAccounting taxAccounting = new TaxAccounting(50, "TaxAccounting");
        System.out.println("Taxes of our company are: " + taxAccounting.account());

        FinancialAccount financialAccount = new FinancialAccount(50, "FinancialAccount");
        System.out.println("Amount salary of our employees is: " + financialAccount.account());

        Marketing marketingDep = new Marketing(50, "Marketing");
        marketingDep.marketing();

        SMM smm = new SMM(50, "SMM");
        smm.marketing();

        SEO seo = new SEO(50, "SEO");
        seo.marketing();
    }
}

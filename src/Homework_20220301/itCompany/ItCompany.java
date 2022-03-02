package Homework_20220301.itCompany;

public class ItCompany {
    private int countOfEmployers;
    private String companyName;

    public ItCompany() {
    }

    public ItCompany(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public ItCompany(int countOfEmployers, String companyName) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Number account() {
        return this.countOfEmployers * 2;
    }
}

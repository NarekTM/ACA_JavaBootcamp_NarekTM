package Homework_20220228;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int[] productNumbers;

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(int[] productNumbers) {
        this.productNumbers = productNumbers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "Count of workers = " + countOfWorkers +
                ", Name = '" + name + '\'' +
                ", Phone number = '" + phoneNumber + '\'' +
                '}';
    }
}

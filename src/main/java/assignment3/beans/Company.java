package assignment3.beans;

public class Company {
    private String name;
    private String address;
    private int numberOfCarsSold;
    private double totalProfit;

    public Company(String name, String address, int numberOfCarsSold, double totalProfit) {
        this.name = name;
        this.address = address;
        this.numberOfCarsSold = numberOfCarsSold;
        this.totalProfit = totalProfit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCarsSold() {
        return numberOfCarsSold;
    }

    public void setNumberOfCarsSold(int numberOfCarsSold) {
        this.numberOfCarsSold = numberOfCarsSold;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCarsSold=" + numberOfCarsSold +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

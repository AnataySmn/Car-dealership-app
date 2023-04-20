package assignment3.beans;

public class Vehicle
{
    private String make;
    private String model;
    private String condition;
    private String engineCylinders;
    private int year;
    private int numDoors;
    private double price;
    private String color;
    private String thumbnailImage;
    private String fullSizeImage;
    private String dateSold;

    public Vehicle(String make, String model, String condition, String engineCylinders, int year, int numDoors, double price, String color, String thumbnailImage, String fullSizeImage, String dateSold) {
        this.make = make;
        this.model = model;
        this.condition = condition;
        this.engineCylinders = engineCylinders;
        this.year = year;
        this.numDoors = numDoors;
        this.price = price;
        this.color = color;
        this.thumbnailImage = thumbnailImage;
        this.fullSizeImage = fullSizeImage;
        this.dateSold = dateSold;
    }

    public Vehicle() {

    }

    public Vehicle(String make, String model, int year, String color, String soldDate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.dateSold = dateSold;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(String engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getFullSizeImage() {
        return fullSizeImage;
    }

    public void setFullSizeImage(String fullSizeImage) {
        this.fullSizeImage = fullSizeImage;
    }

    public String getDateSold() {
        return dateSold;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", condition='" + condition + '\'' +
                ", engineCylinders='" + engineCylinders + '\'' +
                ", year=" + year +
                ", numDoors=" + numDoors +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                ", fullSizeImage='" + fullSizeImage + '\'' +
                ", dateSold='" + dateSold + '\'' +
                '}';
    }

    protected String writeToFile(){

        return String.format("%s,%s,%s,%s,%n", make, model, year, color);
    }
}


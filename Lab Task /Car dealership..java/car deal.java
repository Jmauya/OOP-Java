package oop;

import java.time.Year;

public class Car {

    private String modelName;
    private int year;
    private double price;

    // Getter and Setter for modelName
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if(year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Warning: Year cannot be in the future! Setting ignored.");
        }
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display car details
    public void showCarDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Year : " + year);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

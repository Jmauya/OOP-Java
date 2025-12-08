package oop;

public abstract class Appliance {

    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    // abstract method
    abstract void operate();

    // concrete method without boolean
    void powerSwitch(String action) {
        System.out.println(brand + " is now " + action);
    }
}

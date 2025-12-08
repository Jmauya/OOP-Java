package oop;

public class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println("Washing clothes...");
    }
}

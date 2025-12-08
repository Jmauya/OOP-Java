package oop;

public class Refrigerator extends Appliance {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println("Cooling food...");
    }
}

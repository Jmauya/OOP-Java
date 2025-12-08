package oop;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModelName("Toyota Corolla");
        car1.setYear(2020);
        car1.setPrice(25000);
        car1.showCarDetails();

        Car car2 = new Car();
        car2.setModelName("Tesla Model S");
        car2.setYear(2025);  // future year, should trigger warning
        car2.setPrice(90000);
        car2.showCarDetails();
    }
}

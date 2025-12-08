// main class
package Oop;
public class Main {

	public static void main(String[] args) {

		Car c1 = new Car("Mercedes",127.8F,2003);
		c1.carDetails();
		
		Car c2 = new Car("Mercedes",127.8F,2003,"Grey");
		c2.carDetails();
	}

}

//
package oop;

public class Car {

    String model_name;
    float speed;
    int year;
    String colour;

    // Constructor without colour
    
    public Car(String model_name, float speed, int year) {
        this.model_name = model_name;
        this.speed = speed;
        this.year = year;
        this.colour = "Not specified"; // default value
    }

    // Constructor with colour
    public Car(String model_name, float speed, int year, String colour) {
        this.model_name = model_name;
        this.speed = speed;
        this.year = year;
        this.colour = colour;
    }

    // Print details
    void carDetails() {
        System.out.println("Model Name: " + model_name);
        System.out.println("Current Speed: " + speed);
        System.out.println("Model Year: " + year);
        System.out.println("Colour of The Car: " + colour);
    }
}

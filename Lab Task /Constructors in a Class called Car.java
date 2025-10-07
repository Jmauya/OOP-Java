package lab;

class Car {
    String model_name;
    int year;
    int speed;
    String color;

  
  
  // Constructor 1: without color
  
    public Car(String model_name, int year, int speed) {
        this.model_name = model_name;
        this.year = year;
        this.speed = speed;
      
    }

    // Constructor 2: with color
  
    public Car(String model_name, int year, int speed, String color) {
        this.model_name = model_name;
        this.year = year;
        this.speed = speed;
        this.color = color;
    }

    public void showDetails() {
        System.out.println("Model: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
      
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2025, 55);
        Car car2 = new Car("Mercedes", 2025, 55, "Blue");

        car1.showDetails();
        car2.showDetails();
    }
}

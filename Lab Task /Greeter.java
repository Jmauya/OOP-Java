//main class
package oop;

public class Main {

    public static void main(String[] args) {

        Greeter g = new Greeter();

        g.greet();                     // no input
        g.greet("Liam");               // name only
        g.greet("Sophia", 22);         // name + age
    }
}


//
package oop;

public class Greeter {

    // 1. Greet without input
    void greet() {
        System.out.println("Hello! Nice to meet you!");
    }

    // 2. Greet with name only
    void greet(String name) {
        System.out.println("Hello " + name + "! Nice to meet you!");
    }

    // 3. Greet with name and age
    void greet(String name, int age) {
        System.out.println("Hello " + name + "! You are " + age + " years old!");
    }
}

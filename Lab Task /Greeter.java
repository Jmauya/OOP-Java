package oop;

public class Main {

    public static void main(String[] args) {

        Greeter g = new Greeter();

        g.greet();                     // no input
        g.greet("Liam");               // name only
        g.greet("Sophia", 22);         // name + age
    }
}

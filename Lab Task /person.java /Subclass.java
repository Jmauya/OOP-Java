package oop;

public class Student extends Person {

    public Student(String person_name, int id) {
        super(person_name, id);
    }

    void study() {
        System.out.println("Studying!");
    }
}

package oop;

public class Person {

    String person_name;
    int id;

    public Person(String person_name, int id) {
        this.person_name = person_name;
        this.id = id;
    }

    void showInfo() {
        System.out.println("Name: " + person_name);
        System.out.println("ID: " + id);
    }
}

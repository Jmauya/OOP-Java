package oop;

public class Teacher extends Person {

    public Teacher(String person_name, int id) {
        super(person_name, id);
    }

    void teach() {
        System.out.println("Teaching!");
    }
}

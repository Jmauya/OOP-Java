package oop;

public class Main {

    public static void main(String[] args) {
        
        Student s = new Student("Alice", 101);
        s.showInfo();
        s.study();
        
        System.out.println();

        Teacher t = new Teacher("Mr. John", 201);
        t.showInfo();
        t.teach();
    }
}

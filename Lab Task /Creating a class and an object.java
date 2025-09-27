class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Creating object
        s1.name = "Student name ";
        s1.age = 21 ;
        s1.display(); // Calling method
    }
}
 

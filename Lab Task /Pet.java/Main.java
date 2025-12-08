package oop;

public class Main {

	public static void main(String[] args) 
	{
		Pet p1 = new Pet();
		
		Dog d1 = new Dog();
		p1.displayinfo("Bob", 7);
		d1.bark();
		
		Cat c1 = new Cat();
		p1.displayinfo("Oggy", 7);
		c1.meow();
	}

}

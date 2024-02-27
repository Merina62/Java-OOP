
public class Animal {
	public void makeSound() {
		System.out.println("Animal Makes Sound.");
	}

}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog says bow bow.");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat says meow meow.");
	}
}


interface Animal {
	void eat();
	void walk();
}

interface printable{
	void display();
}

class Cow implements Animal,printable{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is display section.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cow can eat.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cow can walk.");
	}
	
}


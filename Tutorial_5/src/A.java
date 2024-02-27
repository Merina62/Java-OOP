
public class A {
	public void Display() {
		System.out.println("Class A");
	}

}

class B extends A{
	public void Display() {
		System.out.println("Class B");
	}
}

class C extends B{
	public void Display() {
		System.out.println("Class C");
	}

}

public class Shape {
	public void getPerimeter() {
		System.out.println("This is Perimeter.");
	}
	public void getArea() {
		System.out.println("This is Area.");
	}
	
}

class Circle extends Shape{
	int r=5;
	final float pi= (float) 3.14;
	public  void getPerimeter() {
		double perimeter = 2*pi*r;
		System.out.println("Perimeter: "+perimeter);
	}
	public void getArea() {
		double area= pi*r*r;
		System.out.println("Area: "+area);
	}
	
	
}

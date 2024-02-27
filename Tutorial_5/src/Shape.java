
public class Shape {
	String color;
	public void area(int length, int width) {
		int area= length * width;
		System.out.println("Area: \n"+area);
	}
}
class Rectangle extends Shape{
	int length;
	int width;
	
	Shape s= new Shape();
	s.length=2;
	s.width=4;
	}
	public Rectangle() {
		super.color="Blue";
	}
	
	public void main(String[] args) {
		
	}
}

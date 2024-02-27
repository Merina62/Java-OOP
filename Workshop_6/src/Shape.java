
abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Quadrilateral extends Shape{

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area");
	}

	@Override
	void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter");
	}
	
}
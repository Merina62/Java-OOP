
abstract class Vehicle {
	void wheel() {
		System.out.println("This is wheel");
	}
	
	abstract void door();
}

class Bus extends Vehicle{

	@Override
	void door() {
		// TODO Auto-generated method stub
		System.out.println("This is door.");
	}
	
}



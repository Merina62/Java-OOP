
interface LivingBeing {
	void specialFeature();
}

class Fish implements LivingBeing{

	@Override
	public void specialFeature() {
		// TODO Auto-generated method stub
		System.out.println("FIsh swims");
	}
	
}

class Bird implements LivingBeing{

	@Override
	public void specialFeature() {
		// TODO Auto-generated method stub
		System.out.println("Bird Flies");
	}
}



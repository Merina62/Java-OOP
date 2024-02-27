
public class Parent {
	private String name="Merina";
	protected int age=19;
	public String caste="Shrestha";
	
}
class Child extends Parent{
	public String name(){
		return name; // Error: privateVariable has private access in Parent
	}
	public int age(){
		return age;
	}
	public String caste(){
		return caste;
	}
}




public class Person {
	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Employee extends Person {
	int employeeid=45;
	public static void main(String[] args) {
		Employee e= new Employee();
		e.name="Merina";
		e.age=19;
		System.out.println("Name: "+e.name+"\nAge: "+e.age+"\nEmployeeid: "+e.employeeid);
	}
}

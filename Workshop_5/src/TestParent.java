
public class TestParent {

	public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Protected Variable: " + child.age());
        System.out.println("Public Variable: " + child.caste());
    }

}

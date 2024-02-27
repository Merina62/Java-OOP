
public class NewExcep {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}
        
	}
}

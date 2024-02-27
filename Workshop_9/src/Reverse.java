import java.util.Collections;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "Hello World";
		String[] t= test.split("\\s+");
		Stack<String> list1= new Stack<>();
		for(String i:t) {
			list1.push(i);
		}
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		
		
	}

}

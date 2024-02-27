import java.util.Stack;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack= new Stack<String>();
		stack.push("Read");
		stack.push("Write");
		stack.push("Code");
		System.out.println(stack);
		
		
		System.out.println("Pop: "+stack.pop());
		
		stack.push("Debug");
		stack.push("Test");
		System.out.println("After Push: "+stack);
		
		System.out.println("Peek: "+stack.peek());
	}

}

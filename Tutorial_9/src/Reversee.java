import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reversee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new LinkedList();
		list.add("Apple");
		list.add("Banana");
		list.add("Coconut");
		list.add("Date");
		list.add("Elderberry");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}

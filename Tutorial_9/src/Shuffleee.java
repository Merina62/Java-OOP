import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffleee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Coconut");
		list.add("Date");
		list.add("Elderberry");
		System.out.println(list);
		shuffleArrayList(list);
		System.out.println(list);
		
		
	}
	private static void shuffleArrayList(List<String> list) {
        Collections.shuffle(list);
    }
}

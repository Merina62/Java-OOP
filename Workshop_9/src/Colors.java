import java.util.*;
public class Colors {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Blue");
		list.add("Red");
		list.add("White");
		list.add("Brown");
		list.add("Green");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		if(list.contains("Red")) {
			System.out.println("Red is present");
		} else {
			System.out.println("Red is not Present");
		}
		
		Collections.shuffle(list);
		System.out.println("Shuffled elements: "+list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}

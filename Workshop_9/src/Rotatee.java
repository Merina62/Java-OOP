import java.util.ArrayList;
import java.util.Collections;

public class Rotatee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		Collections.rotate(list, 2);
		System.out.println(list);
	}

}

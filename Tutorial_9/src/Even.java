import java.util.*;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		for(int a: list) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}

}

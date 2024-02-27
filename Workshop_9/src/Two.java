import java.util.LinkedList;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		System.out.println(list);
		list.addFirst(0);
		list.addLast(9);
		System.out.println(list);
	}

}

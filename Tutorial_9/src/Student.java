import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Hari");
		list.add("Sita");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}

}

import java.util.*;

public class Link {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Hari");
        list.add("Sita");
        System.out.println(list);
        list.addFirst("Gita");
        System.out.println(list);
        list.addLast("Riya");
        System.out.println(list);
        
        if(list.isEmpty()) {
        	System.out.println("List is empty");
        } else {
        	System.out.println("List is not empty");
        }
    }
    
}

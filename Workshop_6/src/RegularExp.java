import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class RegularExp {
//	public static void main(String[] args) {
//	Pattern p= Pattern.compile("[a-zA-Z0-9]+");
//	Matcher m= p.matcher("Merina10");
//	boolean b= m.matches();
//	System.out.println(b);
//	}
//}


//public class RegularExp{
//	 public static void main(String[] args) {
//	        Pattern p = Pattern.compile("^[A-Z][a-z]+$");
//	        Matcher m = p.matcher("Merina");
//	        boolean b = m.matches();  
//	        System.out.println(b);
//	    }
//	}
//



//public class RegularExp{
//    public static void main(String[] args) {
//        String input = "Jawdaw.txt";
//        String allowed = "^[A-Z]+[a-z]+.txt$";
//        if (Pattern.matches(allowed, input)) {
//            System.out.println("Contains");
//        } else {
//            System.out.println("Does not Contains");
//        }
//    }
//}


 


 

public class RegularExp{
public static void main(String[] args) {
	String input = "Jawdaw22312";
    String allowed = "^[A-Za-z][A-Za-z0-9_]+{3,16}$";
    if (Pattern.matches(allowed, input)) {
        System.out.println("Contains");
    } else {
        System.out.println("Does not Contains");
    }
    }
}


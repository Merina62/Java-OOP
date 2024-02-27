import java.util.Iterator;
import java.util.TreeSet;

public class TreeColor {

    public static void main(String[] args) {
        TreeSet<String> colorSet = new TreeSet<String>();
        colorSet.add("Ram");
        colorSet.add("Shyam");
        colorSet.add("Sita");
        colorSet.add("Gita");
        // Print out the sorted set
        System.out.println("Sorted Names:");
        printTreeSet(colorSet);
    }

    private static void printTreeSet(TreeSet<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
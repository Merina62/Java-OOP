import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        // Original ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Sort in ascending order
        Collections.sort(colors);
        System.out.println("Sorted in ascending order: " + colors);

        // Sort in descending order using Collections.reverseOrder()
        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + colors);
    }
}

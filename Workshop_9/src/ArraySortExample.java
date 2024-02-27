import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExample {
    public static void main(String[] args) {
        // Original array of integers
        int[] numbers = {45, 12, 89, 34, 67, 23, 56};

        // Sort in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));

        // Sort in descending order using Comparator.reverseOrder()
        Integer[] boxedNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers, Comparator.reverseOrder());
        System.out.println("Sorted in descending order: " + Arrays.toString(boxedNumbers));
    }
}

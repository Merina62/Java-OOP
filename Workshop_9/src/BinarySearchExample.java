import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Initialize an ArrayList with a set of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(48);
        numbers.add(56);
        numbers.add(67);
        numbers.add(73);
        numbers.add(89);

        // Sort the ArrayList (binary search requires a sorted list)
        Collections.sort(numbers);

        // Perform a binary search to find a particular integer
        int target = 56;
        int index = binarySearch(numbers, target);

        // Display the result
        if (index != -1) {
            System.out.println("The integer " + target + " is found at index " + index);
        } else {
            System.out.println("The integer " + target + " is not present in the list");
        }
    }

    // Implement a binary search algorithm for a sorted ArrayList
    private static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid; // Target found
            } else if (list.get(mid) < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}

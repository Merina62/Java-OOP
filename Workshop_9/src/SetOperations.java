import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Initialize set1
        Set<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        // Initialize set2
        Set<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        // Print the original sets
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // Perform union
        Set<String> unionSet = performUnion(set1, set2);
        System.out.println("Union: " + unionSet);

        // Perform intersection
        Set<String> intersectionSet = performIntersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);

        // Perform difference
        Set<String> differenceSet = performDifference(set1, set2);
        System.out.println("Difference (Set1 - Set2): " + differenceSet);
    }

    // Method to perform union of two sets
    public static Set<String> performUnion(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method to perform intersection of two sets
    public static Set<String> performIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    // Method to perform difference of two sets (Set1 - Set2)
    public static Set<String> performDifference(Set<String> set1, Set<String> set2) {
        Set<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
}
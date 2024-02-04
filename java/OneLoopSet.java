import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneLoopSet {

    // Function to check for duplicates in the list
    public static boolean containsDuplicates(List<Integer> numbers) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (seenNumbers.contains(number)) {
                return true; // Duplicate found
            }
            seenNumbers.add(number);
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        // Test case 1: List with duplicates
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 3);
        System.out.println("Does numbers1 contain duplicates? " + containsDuplicates(numbers1));  // Output: true

        // Test case 2: List without duplicates
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
        System.out.println("Does numbers2 contain duplicates? " + containsDuplicates(numbers2));  // Output: false

        // Test case 3: List with multiple duplicates
        List<Integer> numbers3 = List.of(1, 2, 2, 3, 4, 4);
        System.out.println("Does numbers3 contain duplicates? " + containsDuplicates(numbers3));  // Output: true
    }
}

import java.util.List;

public class OneLoop {

    public static boolean containsDuplicates(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        // List with duplicates
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 3);
        System.out.println("Does numbers1 contain duplicates? " + containsDuplicates(numbers1)); // Output: true

        // List without duplicates
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
        System.out.println("Does numbers2 contain duplicates? " + containsDuplicates(numbers2)); // Output: false

        // List with multiple duplicates
        List<Integer> numbers3 = List.of(1, 2, 2, 3, 4, 4);
        System.out.println("Does numbers3 contain duplicates? " + containsDuplicates(numbers3)); // Output: true
    }
}

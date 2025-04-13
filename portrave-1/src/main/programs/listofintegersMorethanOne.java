package programs;

import java.util.*;

public class listofintegersMorethanOne {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 3);

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}





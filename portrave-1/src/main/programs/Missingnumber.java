package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Missingnumber
{
    public static void main(String[] args) {
        int[] a = {-2, 0, 1, 5, 9, 15};

        Set<Integer> set = new HashSet<>();
        for (int val : a) {
            set.add(val);
            System.out.println(val);
        }


        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        System.out.println("All missing numbers:");
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

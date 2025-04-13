package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoArraySingleSort {

    public static void mergeSortedLists(){


        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,6));
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }

        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        System.out.println(merged);
    }

    public static void main(String[] args) {

        TwoArraySingleSort t =new TwoArraySingleSort();
        t.mergeSortedLists();
    }
}

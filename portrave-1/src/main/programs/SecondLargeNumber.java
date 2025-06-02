package programs;

import java.util.*;

public class SecondLargeNumber
{
    public static void main(String[] args) {
        int arr[] ={1,23,4,1};
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second distinct largest element.");
        }
        System.out.println(secondLargest);
        List<Integer> a= new ArrayList<>(Arrays.asList(1, 3, 2, 1, 4, 3));
        List<Integer> b= new ArrayList<>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(a);
        System.out.println(hs);


    }


}


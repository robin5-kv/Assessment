package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniion
{
    public static void main(String[] args) {

                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
                List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
                //list2

                // Finding Union
                Set<Integer> unionSet = new HashSet<>(list1);
                unionSet.addAll(list2);
                System.out.println("Union: " + unionSet);

                // Finding Intersection
                Set<Integer> intersectionSet = new HashSet<>(list1);
                intersectionSet.retainAll(list2);
                System.out.println("Intersection: " + intersectionSet);

            Set<String> unionSet1 = new HashSet<>();
            unionSet1.add("robin");
            unionSet1.add("robin");
            System.out.println(unionSet1);
            unionSet1.add(null);


        //List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

    }
}

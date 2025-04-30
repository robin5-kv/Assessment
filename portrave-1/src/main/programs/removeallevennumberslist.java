package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeallevennumberslist
{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        List<Integer> evelist = new ArrayList<>();
        for (Integer value : list1) {
            if (value % 2 == 0) {
                evelist.add(value);
            }
        }
        //  to remove the list

        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num % 2 == 0) {
                itr.remove();
            }
        }
        
    }

}

package programs;

import java.util.*;

public class duplicateset
{
    public static void main(String[] args) {
        List<Integer> a =new ArrayList<>(Arrays.asList(1,2,3,4,4,3,2,22,1));
        List<Integer> c =new ArrayList<>(Arrays.asList(1,2,3,4,4,3,2,22,1));
        Set b = new HashSet<>(a);
        Set d = new HashSet<>(a);
        //d.re
        System.out.println(b +" "+ d);

       // System.out.println(am);

    }
}

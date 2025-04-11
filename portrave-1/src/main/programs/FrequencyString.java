package programs;


import java.util.*;


public class FrequencyString {
    public static void main(String[] args) {
        String name = "apple is great fruit";
        char[] namearrary = name.toCharArray();
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char name1 : namearrary) {
            if (hm.containsKey(name1)) {
                hm.put(name1, hm.get(name1) + 1);

            } else {
                hm.put(name1, 1);

            }
        }
        Iterator<Map.Entry<Character,Integer>>  b=  hm.entrySet().iterator();
        //Set<Map.Entry<Character,Integer>> map1 = hm.entrySet();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            //if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
           // }


        }
        Set<Character> map2= hm.keySet();
        //System.out.println(map2.);

    }

}
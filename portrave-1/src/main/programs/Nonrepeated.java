package programs;

import java.util.HashMap;
import java.util.Map;

public class Nonrepeated {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val:a){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer> val:hm.entrySet()){
            if(val.getValue()==1){
                System.out.println(val.getKey()+ " :: "+val.getValue());
            }


        }

    }
}





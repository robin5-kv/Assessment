package programs;

import java.util.*;

public class Numberfrequency {

    public static void main(String[] args) {
        Long num =797948937988L;
        long numvalue;
        HashMap<Long,Integer> hm = new  HashMap<Long,Integer>();
        while (num>0)
        {
            numvalue= num%10;
            if(hm.containsKey(numvalue)){
                hm.put(numvalue,hm.get(numvalue)+1);
            }
            else{
                hm.put(numvalue,1);

            }
            num=num/10;
        }

        for(Map.Entry<Long,Integer> ferquncynum : hm.entrySet()){
            System.out.println("Number "+ferquncynum.getKey() +"::::::"+ferquncynum.getValue() );
        }
    }
}

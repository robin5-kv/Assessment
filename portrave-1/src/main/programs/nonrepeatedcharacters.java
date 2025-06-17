package programs;

import java.util.HashMap;

public class nonrepeatedcharacters
{
    public static void main(String[] args) {

        String name= "Programming";
        char[] namearr=name.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char nam:namearr){
            hm.put(nam,hm.getOrDefault(nam,0)+1);


        }
        for (char c : namearr) {
            if (hm.get(c) == 1) {
                System.out.println("First non-repeated character: " + c);
                return;
            }
        }

        System.out.println("No non-repeated character found.");

    }
}

package programs;

import java.util.*;

public class Reveword
{
    public static void main(String[] args) {
        String Sentence= "I am a good boy";
       String[] sentArray =Sentence.split("\\s");
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        for(String word:sentArray){
            if(hm.containsKey(word)){
                hm.put(word,hm.get(word)+1);
            }
            else{
                hm.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> words:hm.entrySet()){
            System.out.println(words.getKey()+ "  :::: "+words.getValue());
        }

        List  h = new ArrayList(Arrays.asList(1,2,3));

    }
}




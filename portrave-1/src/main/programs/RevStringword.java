package programs;

import java.util.regex.Pattern;

public class RevStringword {
    public static void main(String[] args) {
        String name="Robin is good";
        Pattern p = Pattern.compile("\\s");
        String[] namear= p.split(name);
        String revName=" ";
        for(int i=0;i<namear.length;i++)
        {
            if(i==namear.length-1){
              revName=namear[i]+revName;
            }
            else{
                revName=" "+namear[i]+revName;

            }
        }
        System.out.println(revName);
    }
}

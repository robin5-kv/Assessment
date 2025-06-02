package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate
{
    public static void main(String[] args) {
        String name = "programming";
        StringBuilder result = new StringBuilder();

        Set<Character> seen = new LinkedHashSet<>();

        for (char c : name.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }

     /* for(int i=0; i<a.length();i++)
    {
        String c=""+a.charAt(i);
        if(result.contains(c))
        {
            continue;
        }
        result=result+c;
    }
  System.out.print(result);
}*/
}

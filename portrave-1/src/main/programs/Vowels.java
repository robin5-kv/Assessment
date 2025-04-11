package programs;

public class Vowels
{
    public static void main(String[] args) {
        String a= "Automation".toLowerCase();
       char[] letter= a.toCharArray();
       int vowelcount =0;
       int consonant =0;
       int space =0;
       for(int i=0;i<a.length();i++)
       {
           if( (a.charAt(i)=='a') || (a.charAt(i)=='e')|| (a.charAt(i)=='i')||
                   (a.charAt(i)=='o')|| (a.charAt(i)=='u'))
           {
               vowelcount++;
           } else if ((a.charAt(i)==' ')) {
               space++;
           }
           else {
               consonant++;
           }


       }
        System.out.println(vowelcount);
        System.out.println(consonant);
        System.out.println(space);
    }

    //remove vowel



}

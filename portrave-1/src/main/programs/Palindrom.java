package programs;

public class Palindrom {
    public static boolean isPalindrome(String name) {
        String temp = "";
        temp = name;
      char[] temparray =  temp.toCharArray();
      String revPalin="";
      for(int i =name.length()-1;i>=0;i--){

          revPalin=revPalin+temparray[i];
      }
      if(name.equals(revPalin)){
          System.out.println("p");
          return true;
      }
      else{
          System.out.println("No Pa");
          return false;
      }

    }

    public static void main(String[] args) {
        isPalindrome("butter");
    }
}

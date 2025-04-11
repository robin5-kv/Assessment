package programs;

public class Anagram {
    public static boolean checkPalindrome(String name1, String name2) {

        if (name1.length() == name2.length()) {
            String temp = "";
            char[] namechar = name1.toCharArray();
            char[] namechar1 = name2.toCharArray();
            System.out.println("Length are equal");
            for (int i = 0; i < namechar.length; i++) {
                for (int j = 0; j < namechar1.length; j++) {
                    if (namechar[i] == namechar1[j]) {
                        temp = temp + String.valueOf(namechar1[j]);
                        break;
                    }
                }


            }
            System.out.println("It is anangram words are " + name1 + " and " + name2);
            return true;
        } else {
            System.out.println("Length are  not equal");
            return false;
        }
    }

    public static void main(String[] args) {
        checkPalindrome("but", "tub");


    }
}

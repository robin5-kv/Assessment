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
            if(name1.equals(temp)){
                return true;
            }
            else {
                return false;
            }
        } else {
            System.out.println("Length are  not equal");
            return false;
        }
        /*char[] chArray1 = str1.toCharArray();
        char[] chArray2 = str2.toCharArray();
        Arrays.sort(chArray1);
        Arrays.sort(chArray2);
        System.out.println(Arrays.equals(chArray1, chArray2));*/
    }

    public static void main(String[] args) {
        checkPalindrome("listen", "silent");


    }
}

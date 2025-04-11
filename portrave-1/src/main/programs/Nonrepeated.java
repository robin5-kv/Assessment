package programs;

public class Nonrepeated {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3};

        int nonrepeated = 0;
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = '0';

                }
                if ((a[i] != '0') && (count == 1)) {
                    nonrepeated = a[i];
                }
            }
        }
        System.out.println(nonrepeated);
    }
}





package programs;

public class movezeros {
    static void movezeros(int[] a) {
        int count = 0;

		/*
		 Transverse an array and first move all zero elements at the front

		 */
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }
        }
        while (count < a.length) {
            a[count++] = 0;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = {1, 0, 2, 0, 3, 0, 40, 0};
        movezeros(a);
    }
}

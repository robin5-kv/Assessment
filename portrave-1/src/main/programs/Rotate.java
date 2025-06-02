package programs;

public class Rotate
{
    public static void rotateRight(int[] arr, int k) {

        int n = arr.length;
        k = k % n; // to handle if k > n
        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

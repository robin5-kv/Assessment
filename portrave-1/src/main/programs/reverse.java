package programs;

public class reverse {

    public static void rotate(int[] arr, int k)
    {
        int n = arr.length;
        k= k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public  static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String name ="robin ";
        char[] namearray= name.toCharArray();//[r,o,,b,i,n]
       String  rev= "";
       for(int i=name.length()-1;i>=0;i--)
       {
           rev=rev+namearray[i];
       }
        System.out.println(rev);

    }
    //
}

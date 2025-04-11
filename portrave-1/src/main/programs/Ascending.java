package programs;

import java.util.Arrays;

public class Ascending
{
    public static void main(String[] args) {
        int a[] ={1,4,2,6,7,4,5};
        System.out.println(Arrays.toString(a));
        for(int i =0;i<a.length-1;i++)
        {
            for(int j =0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

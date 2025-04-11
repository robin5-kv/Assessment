package programs;

public class Maxarray {
    public static void main(String[] args) {
        int a[] ={-10,-1,1,5,6,7,78,8};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }

}

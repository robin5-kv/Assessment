package programs;

public class MoveZerostoRight {

    public static void shownumber(int a[]){
         int count =a.length-1;
         for(int i =a.length-1;i>=0;i--)
         {
             if(a[i]!=0)
             {
                 a[count--]=a[i];
             }
         }
         while(count >=0){
             a[count--]=0;
         }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }

    public static void main(String[] args) {
        shownumber(new int[]{1, 5, 0, 6, 0, 7, 0});
    }

}

package programs;

public class DuplicateArray {
    public static void main(String[] args){
        int a[] ={1,4,5,6,2,5};
        boolean duplicateElement=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    duplicateElement=true;
                    System.out.println("The duplicate element is   " +a[i]+ " found in two position in  "  +i+ " and " +j);
                    break;
                }
            }
        }
    }

}

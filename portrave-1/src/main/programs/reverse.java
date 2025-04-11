package programs;

public class reverse {

    public static void main(String[] args) {
        String name ="robin ";
        char[] namearray= name.toCharArray();
       String  rev= "";
       for(int i=name.length()-1;i>=0;i--)
       {
           rev=rev+namearray[i];
       }
        System.out.println(rev);

    }
}

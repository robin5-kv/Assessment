package programs;

public class Add {
    public static void main(String[] args) {
        int num =1013;
        int  add =0;
        while(num>0)
        {
            add =add +num%10;
            num =num/10;
        }
        System.out.println(add);
    }
}

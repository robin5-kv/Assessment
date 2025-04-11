package programs;

public class Armstrongnumber {
    public static void main(String[] args) {
        int num = 371;
        int temp;
        double result = 0;
        int remainder;
        temp = num;
        System.out.println(temp);
        while(temp!=0)
        {
            remainder = temp % 10;
            result = result + Math.pow(remainder, 3);
            temp = temp/10;


        }
        if (result == num) {
            System.out.println("a");
        } else {
            System.out.println("no");

        }
    }
}

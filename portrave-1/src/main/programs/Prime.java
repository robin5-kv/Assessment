package programs;

public class Prime
{
    public static boolean isPrime(int num){
        if(num<0){
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%2==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void printnum(int number){
        for(int i=2;i<number;i++)
        {
            if(isPrime(i))
            {
                System.out.println("prime numbers re"+i+"");
            }
        }
    }

    public static void main(String[] args) {
        printnum(99);
    }
}

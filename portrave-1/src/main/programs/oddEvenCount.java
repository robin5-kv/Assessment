package programs;

public class oddEvenCount
{
    public static void main(String[] args) {
        int num = 23456;
        int oddcount = 0;
        int evencount = 0;
        int temp;
        int add=0;
        int addodd=0;
        while (num > 0) {

            temp =num%10;
            System.out.println(temp);
            if(temp%2==0){
                evencount++;
                add=add+temp;
            }
            else{
                oddcount++;
                addodd=addodd+temp;

            }
            num=num/10;
        }
        System.out.println("sum of even  numbers is "+add + " " + evencount);
        System.out.println("sum of even numbers is "+addodd + " " + oddcount);
    }

    }



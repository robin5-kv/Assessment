package programs;

public class Splcharcters
{
    public static void main(String[] args) {
        String name ="^*&^&#*@^&**@*^&*@^*&^robin";
        String robin =name.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(robin);
        String name1 ="robin   vibin flljls";
        String n =name1.replaceAll("\\s","");
        System.out.println(n);

    }
}

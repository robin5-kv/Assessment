package programs;

public class RevString {
    public static void main(String[] args) {
        String name = "Robin is a good";
        String[] namearray =name.split(" ");
        String revstring="";
        for(String words:namearray){
            String revword="";
            for(int i=words.length()-1;i>=0;i--)
            {
                revword=revword+words.charAt(i);
            }
            revstring=revstring+revword+" ";
        } System.out.println(revstring);
    }
}

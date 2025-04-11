package programs;

public class removealetter
{
    public static void main(String[] args) {
        String a = "ffgklklkl";
        char[] b= a.toCharArray();
        String add="";
        for(int i=0;i<a.length();i++) {
            if (b[i] == 'f') {
                //System.out.println();
            } else {
                add = add + b[i];
            }
        }
        System.out.println(add);
    }
}

package programs;

import java.util.Arrays;

public class Test
{

   private String[]  sudent;
    private int[] rank;

//    public Test(String[] sudent) {
//        this.sudent = sudent;
//    }

    public String[] getSudent() {
        return sudent;
    }

    public void setSudent(String[] sudent) {
        this.sudent = sudent;
    }
    public void setRank(int[] rank) {
        this.rank = rank;
    }
    public String[] getStudent(){
        return sudent;
    }

    public static void main(String[] args) {
        Test a =new Test();
        a.setSudent(new String[]{"Robin","Vibin"});
        a.setRank(new int[]{40,50});
        System.out.println(Arrays.toString(a.getSudent()));

    }

}

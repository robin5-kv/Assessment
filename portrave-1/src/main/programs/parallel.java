package programs;

public class parallel implements Runnable
{

    private static String browser;
    private parallel(String browser){
        this.browser=browser;
    }
    @Override
    public void run() {
        System.out.println("browswe"+browser);
    }

    public static void main(String[] args) {
       Thread t1 = new Thread(new parallel("chrome"));
        t1.start();
        System.out.println(browser);
    }

}

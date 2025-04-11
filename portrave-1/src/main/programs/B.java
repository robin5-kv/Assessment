package programs;

  abstract class Abc {
      void m1() {
          System.out.println("name");

      }

      abstract void m2();

      abstract void m3();

  }
    public class B extends Abc{

        @Override
        void m2() {
            System.out.println("New Method implemented");
        }

        @Override
        void m3() {
            System.out.println("robin");
        }
    }
class Ab{
    public static void main(String[] args) {

      Abc a = new B();
      a.m1();
      a.m2();

    }

}


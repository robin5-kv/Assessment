package programs;

public interface A {

    void m1();
    void m2();

    public interface B extends A{
        void m3();
        void m4();

    }
    class C implements A,B{

        @Override
        public void m3() {
            System.out.println("A");
        }

        @Override
        public void m4() {
            System.out.println("B");
        }

        @Override
        public void m1() {
            System.out.println("c");
        }

        @Override
        public void m2() {
            System.out.println("d");
        }
    }

    public static void main(String[] args) {
        B obj = new C();
        obj.m3();
        obj.m2();
        A obj2 = new C();
        obj2.m2();


    }
}

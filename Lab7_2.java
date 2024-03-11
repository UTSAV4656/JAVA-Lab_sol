interface A {
    final int p = 5;

    void dispP();
}

interface A1 extends A {
    final int p1 = 10;

    void dispP1();
}

interface A2 extends A {
    final int p2 = 20;

    void dispP2();
}

interface A12 extends A1, A2 {
    final int p12 = 12;

    void dispP12();
}

class Q implements A12 {
    public void dispP() {
        System.out.println("dispP : " + p1);
    }

    public void dispP1() {
        System.out.println("dispP1 : " + p2);
    }

    public void dispP2() {
        System.out.println("dispP2 : " + p12);
    }

    public void dispP12() {
        System.out.println("dispP12 : " + p);
    }

}

public class Lab7_2 {
    public static void main(String arg[]) {
        Q q = new Q();
        q.dispP();
        q.dispP1();
        q.dispP2();
        q.dispP12();

    }
}
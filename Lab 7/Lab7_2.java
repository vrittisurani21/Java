interface A {
    int A = 100; 

    void methodA(); 
}

interface A1 extends A {
    int A1 = 200; 

    void methodA1(); 
}

interface A2 extends A {
    int A2 = 300; 

    void methodA2(); 
}

interface A12 extends A1, A2 {
    int A12 = 400;

    void methodA12(); 
}

class B implements A12 {

    @Override
    public void methodA() {
        System.out.println("A="+A);
    }

    @Override
    public void methodA1() {
        System.out.println("A1="+A1);
    }

    @Override
    public void methodA2() {
        System.out.println("A2="+A2);
    }

    @Override
    public void methodA12() {
        System.out.println("A12="+A12);
    }
}

public class Lab7_2 {
    public static void main(String[] args) {
        B b=new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}

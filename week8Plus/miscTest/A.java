package week8Plus.miscTest;

public class A {
    private int a;

    public A() {
        this(10);
        System.out.print("A1");
    }

    public A(int a) {
        this.a = a;
        System.out.print("A2");
    }
}
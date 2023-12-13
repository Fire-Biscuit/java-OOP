package week8Plus.miscTest;

public class B extends A {
    private int b;

    public B() {
//        this(20);
        System.out.print("B1");
    }

    public B(int b) {
        super(42);
        System.out.print("B2");
        this.b = b;
    }
}
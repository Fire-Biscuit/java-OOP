package week8Plus.miscTest;

public class Test4 {
    public static void main(String[] args) {
        new Fruit().print();
        new Appel().print();
    }
}
class Appel extends Fruit {
    public String watBenIk() {
        return "Appel ";

    }
}

class Fruit {
    private String watBenIk() { // LET OP: private!
        return "Fruit ";
    }

    public void print() {
        System.out.print(watBenIk());
    }
}
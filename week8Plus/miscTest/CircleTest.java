package week8Plus.miscTest;

public class CircleTest {
    public static void main(String[] args) {

        Circle2 cirkel1 = new Circle2(1);
        Circle2 circel2 = new Circle2(4);

        wisselOm1(cirkel1, circel2);
        System.out.println("Na wisselom1: radius cirkel1 = " + cirkel1.getRadius()
                + ", radius cirkel2 = " + circel2.getRadius());

        wisselOm2(cirkel1, circel2);
        System.out.println("Na wisselom2: radius cirkel1 = " + cirkel1.getRadius()
                + ", radius cirkel2 = " + circel2.getRadius());
    }

    public static void wisselOm1(Circle2 cirkel1, Circle2 circel2) {
        Circle2 temp = cirkel1;
        cirkel1 = circel2;
        circel2 = temp;
    }

    public static void wisselOm2(Circle2 cirkel1, Circle2 cirkel2) {
        int temp = cirkel1.getRadius();
        cirkel1.setRadius(cirkel2.getRadius());
        cirkel2.setRadius(temp);
    }
}

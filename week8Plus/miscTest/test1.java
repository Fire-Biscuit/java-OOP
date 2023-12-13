package week8Plus.miscTest;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        int number = 13;
        Circle circle = new Circle(13);
        circle.change1(number);
        circle.change2(circle);
        System.out.println(number + ", " + circle.radius);
    }
}

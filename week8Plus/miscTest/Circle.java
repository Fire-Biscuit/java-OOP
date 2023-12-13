package week8Plus.miscTest;

public class Circle {
    int radius;

    Circle(int newRadius) {
        radius = newRadius;
    }
    public void change1(int a) {
        a = 42;
    }

    public void change2(Circle a) {
        a.radius = 42;
    }
}
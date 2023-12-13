package week6;

public class oefenMain {
    public static void main(String[] args) {
        StateMachine horloge = new StateMachine(new Off());
        horloge.shortPress();
        horloge.shortPress();
        horloge.shortPress();
        horloge.longPress();
        horloge.shortPress();
    }
}
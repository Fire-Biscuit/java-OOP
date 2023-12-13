package week8Plus.exeptionsTryoutTwee;

public class ExeptionsTryoutTweeMain {
    public static void main(String[] args) {
        int getal1 = 3;
        int getal2 = 1;

        try {
            int getal3 = plus(getal1, getal2);
            System.out.println(getal3);
        } catch (NotPositiveExeption e) {
            System.out.println(e.getMessage());
        }

    }

    public static int plus(int getal1, int getal2) throws NotPositiveExeption {
        if (getal1 + getal2 <= 0) {
            throw new NotPositiveExeption("getal is kleiner dan nul");
        }
        int result = getal1 + getal2;
        return result;
    }
}

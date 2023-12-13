package week8Plus.miscTest;

public class Rechthoek {
    int lengte;
    int breedte;

    Rechthoek(int lengte, int breedte) {
        System.out.println("Nee hoor, hier!");
    }

    Rechthoek() {
        System.out.println("Ja, hiero!");
    }


    public static void test1(){
        int[][][] data = {
                {{1, 2},{3, 4}},
                {{5, 6},{7, 8}}
        };
        System.out.print(data[1][0][0]);
    }
}
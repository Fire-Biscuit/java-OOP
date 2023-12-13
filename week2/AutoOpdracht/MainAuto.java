package week2.AutoOpdracht;

public class MainAuto {
    public static void main(String[] args) {

        Auto auto1 = new Auto();
        auto1.merk = "Volvo";
        auto1.type = "model X";
        auto1.gebruiktOfNiet = true;
        auto1.kilometerStand = 100;
        auto1.beschrijving();

        Auto auto2 = new Auto();
        auto2.merk = "Tesla";
        auto2.type = "mini";
        auto2.gebruiktOfNiet = false;
        auto2.kilometerStand = 666;
        auto2.beschrijving();

        Auto auto3 = new Auto();
        auto3.merk = "Audi";
        auto3.type = "model X";
        auto3.gebruiktOfNiet = true;
        auto3.kilometerStand = 860;
        auto3.beschrijving();

    }
}

package week5.HuisdierOpdracht2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HuisdierOpdracht2Main {
    public static void main(String[] args) throws IOException {

        HuisMetDieren huisMetDieren = HuisMetDieren.getInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.println("geef de naam van het bestand op");

        String bestandsNaam = scanner.nextLine();
        String path = "C:\\Users\\mikes\\OneDrive\\school\\programming\\huiswerk\\aenpstart\\src\\week5\\HuisdierOpdracht2\\"
                + bestandsNaam + ".txt";
        FileMaker bestand = new FileMaker(path);

        Kat kat = new Kat();
        Hond hond = new Hond();
        Vogel vogel = new Vogel();
        Schildpad schildpad = new Schildpad();

        HuisMetDieren huis = new HuisMetDieren();
        huis.dierenInDitHuis.add(kat);
        huis.dierenInDitHuis.add(hond);
        huis.dierenInDitHuis.add(vogel);
        huis.dierenInDitHuis.add(schildpad);

        for (int i = 0; i < huis.dierenInDitHuis.size(); i++) {
            System.out.println(huis.dierenInDitHuis.get(i));
        }

        bestand.writeArrayList(huis);

        bestand.read(path);
    }
}
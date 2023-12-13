package week5.lesstofTryout.newFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class newFIleMain {
    public static void main(String[] args) throws FileNotFoundException {

        String bestandsPad = "C:\\Users\\mikes\\OneDrive\\school\\programming\\huiswerk\\aenpstart\\src\\week5\\lesstofTryout\\newFile\\bestand.txt";

        File file = new File(bestandsPad);
        System.out.println("\n" + (String) bestandsPad + "\n");
        delete(file);

        try {
            System.out.println("9 seconds sleep gestart");
            Thread.sleep(9000);
            System.out.println("9 second sleep over");
        }catch (InterruptedException e){
            System.out.println("sleep ging fout");
        }

        start(file);

        try {
            PrintWriter output = new PrintWriter(bestandsPad);
            output.print("Als jouw tekkel ");
            output.print("mijn tekkel tackelt, ");
            output.print("tackelt mijn tekkel ");
            output.print("jouw tekkel terug.");
            output.close();
            System.out.println("Klaar!");
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) { // Doorloop het bestand
            String tekstRegel = scanner.nextLine(); // Haal er één regel uit.
            System.out.println(tekstRegel); // Print deze regel.
        }

        try {
            PrintWriter output = new PrintWriter(file);
            output.print("\ntestwoorden");
        }catch (IOException e){
            System.out.println("Foutmelding in print writen");
            e.printStackTrace();
        }
    }

    public static void delete(File file){
        if(file.delete()) {
            System.out.println("Verwijderen van " + file.getName() + " is gelukt.");
        } else {
            System.out.println("Verwijderen is niet gelukt.");
        }
    }

    public static void start(File file) {
        try {

            if (file.createNewFile()) {
                System.out.println("Bestand aangemaakt, genaamd: " + file.getName());
            } else {
                System.out.println("Bestand bestaat al.\n" + file);
            }
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();
        }
    }
}

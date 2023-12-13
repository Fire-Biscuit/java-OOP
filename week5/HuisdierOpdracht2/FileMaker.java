package week5.HuisdierOpdracht2;

import java.io.*;
import java.util.Scanner;

public class FileMaker {
    private File file;
    private String path;
    public FileMaker(String pathName){
        file = new File(pathName);
        path = pathName;
        start(file);
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

    public static void delete(File file){
        if(file.delete()) {
            System.out.println("Verwijderen van " + file.getName() + " is gelukt.");
        } else {
            System.out.println("Verwijderen is niet gelukt.");
        }
    }

    public void writeArrayList(HuisMetDieren huis) throws IOException {
//        try{
//            PrintWriter output = new PrintWriter(path);
//
//            for (int i = 0; i < huis.dierenInDitHuis.size(); i++) {
//                output.print(huis.dierenInDitHuis.get(i));
//            }
//        } catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
            FileWriter fileWriter = new FileWriter(this.file, true);
            for (int i = 0; i < huis.dierenInDitHuis.size(); i++) {
                String stringProxy = huis.dierenInDitHuis.get(i).toString();
                fileWriter.write(stringProxy);
            }
    }

    public void read(String path) {
        System.out.println("TEST FILEREADER");
        Scanner scanner = new Scanner(path);
        while(scanner.hasNext()) { // Doorloop het bestand
            String tekstRegel = scanner.nextLine(); // Haal er één regel uit.
            System.out.println(tekstRegel); // Print deze regel.
        }
    }

}

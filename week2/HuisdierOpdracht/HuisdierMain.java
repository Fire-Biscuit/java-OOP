package week2.HuisdierOpdracht;

public class HuisdierMain {
    public static void main(String[] args) {

        HuisMetDieren huis = new HuisMetDieren();

        Huisdier huisdier = new Huisdier();     //controle
        Kat kat = new Kat();
        Hond hond = new Hond();
        Vogel vogel = new Vogel();
        Schildpad schildpad = new Schildpad();

        HuisdierKlasseAbstract[] huisdieren = new HuisdierKlasseAbstract[5];
        huisdieren[0] = huisdier;
        huisdieren[1] = kat;
        huisdieren[2] = hond;
        huisdieren[3] = vogel;
        huisdieren[4] = schildpad;

        huis.dierenInDitHuis = huisdieren;

        huis.meestFavorieteHuisdier = schildpad;
        huis.minstFavorieteHuisdier = hond;
        huis.meestFavTeller = 4;
        huis.minstFavTeller = 2;

        for (int i = 0; i < huis.dierenInDitHuis.length; i++) {
            huisdieren[i].setVariabelen();
        }

        for (int i = 0; i < huis.dierenInDitHuis.length; i++) {
            huisdieren[i].MaakGeluid();
        }

        System.out.printf("\nIn dit huis is %s de %s met meest favoriete dier en %s de %s de minst favoriete omdat niemand hem mag.",
                huis.meestFavorieteHuisdier.naam,huis.dierenInDitHuis[4].soort,huis.minstFavorieteHuisdier.naam,huis.dierenInDitHuis[2].soort);
    }
}

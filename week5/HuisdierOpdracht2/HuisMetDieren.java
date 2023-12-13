package week5.HuisdierOpdracht2;

import java.util.ArrayList;

public class HuisMetDieren {

    ArrayList<HuisdierAbstract> dierenInDitHuis = new ArrayList<HuisdierAbstract>();
    public int meestFavTeller;
    public int minstFavTeller;

    private static HuisMetDieren instance;

    public static HuisMetDieren getInstance() {
        if(HuisMetDieren.instance == null) {
            HuisMetDieren.instance = new HuisMetDieren();
        }
        return HuisMetDieren.instance;
    }
}
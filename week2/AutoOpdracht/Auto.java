package week2.AutoOpdracht;

public class Auto {

    public String merk;
    public String type;
    public boolean gebruiktOfNiet;
    public int kilometerStand;

    public void beschrijving(){
        String welOfNietGebruikt = "ongebruikte";
        if (gebruiktOfNiet == true){
            welOfNietGebruikt = "gebruikte";
        }
        System.out.printf("\nde auto is een %s %s %s met een kilometerstand van %d\n", welOfNietGebruikt,merk,type,kilometerStand);
    }
}

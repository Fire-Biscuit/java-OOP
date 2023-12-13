package week5.HuisdierOpdracht2;

public class Schildpad extends HuisdierAbstract {
    @Override

    public void setVariabelen(){
        this.lidwoord = "het";
        this.kleur = "rode";
        this.soort = "schildpad";
        this.naam = "Padtricia";
        this.manierGeluidMaken = "is";
        this.geluid = "stil?";
    }
    public String toString(){
        return "schildpad";
    }
}

package week5.HuisdierOpdracht2;

public class Vogel extends HuisdierAbstract {
    @Override

    public void setVariabelen(){
        this.lidwoord = "de";
        this.kleur = "blauwe";
        this.soort = "Vogel";
        this.naam = "Hawk";
        this.manierGeluidMaken = "krijst";
        this.geluid = "welk geluid het ook is dat vogels maken";
    }
    public String toString(){
        return "vogel";
    }
}
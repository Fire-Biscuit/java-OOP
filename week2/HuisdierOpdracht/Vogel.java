package week2.HuisdierOpdracht;

public class Vogel extends HuisdierKlasseAbstract{
    @Override

    public void setVariabelen(){
        this.lidwoord = "de";
        this.kleur = "blauwe";
        this.soort = "Vogel";
        this.naam = "Hawk";
        this.manierGeluidMaken = "krijst";
        this.geluid = "welk geluid het ook is dat vogels maken";
    }
}
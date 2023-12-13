package week2.HuisdierOpdracht;

public class Huisdier extends HuisdierKlasseAbstract{
    @Override

    public void setVariabelen(){
        this.lidwoord = "lidwoord";
        this.kleur = "kleur";
        this.soort = "soort";
        this.naam = "naam";
        this.manierGeluidMaken = "manierGeluid";
        this.geluid = "geluid";
    }
}
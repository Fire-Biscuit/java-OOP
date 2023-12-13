package week5.HuisdierOpdracht2;

public class Kat extends HuisdierAbstract {
    @Override

    public void setVariabelen(){
        this.lidwoord = "de";
        this.kleur = "zwarte";
        this.soort = "Kat";
        this.naam = "Sint";
        this.manierGeluidMaken = "huilt";
        this.geluid = "miauw";
    }
    public String toString(){
        return "kat";
    }
}
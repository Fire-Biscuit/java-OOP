package week5.HuisdierOpdracht2;


public class Hond extends HuisdierAbstract {

    @Override

    public void setVariabelen(){
        this.lidwoord = "De";
        this.kleur = "bruine";
        this.soort = "hond";
        this.naam = "Dennis";
        this.manierGeluidMaken = "schreeuwt";
        this.geluid = "WAF";
    }

    public String toString(){
        return "hond";
    }
}
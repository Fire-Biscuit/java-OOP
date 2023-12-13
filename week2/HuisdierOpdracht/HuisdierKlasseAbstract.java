package week2.HuisdierOpdracht;

abstract class HuisdierKlasseAbstract {
    protected String lidwoord;
    protected String kleur;
    protected String soort;

    protected String naam;
    protected String manierGeluidMaken;
    protected String geluid;

    public void setVariabelen(){
        this.lidwoord = "lidwoord";
        this.kleur = "kleur";
        this.soort = "soort";
        this.naam = "naam";
        this.manierGeluidMaken = "manierGeluid";
        this.geluid = "geluid";
    }

    public void MaakGeluid(){
        System.out.printf("%s %s %s genaamd %s %s %s.\n",
                this.lidwoord,this.kleur,this.soort,this.naam,this.manierGeluidMaken,this.geluid);
    }
}
package week5.HuisdierOpdracht2;

abstract class HuisdierAbstract {
    protected String lidwoord;
    protected String kleur;
    protected String soort;

    protected String naam;
    protected String manierGeluidMaken;
    protected String geluid;

    abstract void setVariabelen();

    public void MaakGeluid(){
        System.out.printf("%s %s %s genaamd %s %s %s.\n",
                this.lidwoord,this.kleur,this.soort,this.naam,this.manierGeluidMaken,this.geluid);
    }
}

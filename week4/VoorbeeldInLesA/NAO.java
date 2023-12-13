package week4.VoorbeeldInLesA;

public class NAO {
    private Houding houding = new ZitHouding();

    public void dans() {
        System.out.println(this.houding);
    }

    public void zitten(){
        this.houding = new ZitHouding();
    }

    public void staan(){
        this.houding = new StaHouding();
    }
}

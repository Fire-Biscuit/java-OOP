package week4.Toestand30min;

public class Toestandmachine {
    private Toestand currentstate = new ToestandQ0();

    public void processAan(){
        this.currentstate = this.currentstate.aan();
        //System.out.println(this.currentstate);
    }

    public void processUit(){
        this.currentstate = this.currentstate.uit();
        //System.out.println(this.currentstate);
    }

    public void processHeet(){
        this.currentstate = this.currentstate.heet();
        //System.out.println(this.currentstate);
    }
    public void koffiezetten(){
        this.currentstate = this.currentstate.zetKoffie();
    }

    public String toString(){
        return ("\nde currentstate = " + this.currentstate);
    }
}

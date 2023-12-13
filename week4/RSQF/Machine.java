package week4.RSQF;

public class Machine {
    //the starting point is state Q
    private State currentstate = new StateQ();

    public void processA(){
        this.currentstate = this.currentstate.a();
        //System.out.println(this.currentstate);
    }

    public void processB(){
        this.currentstate = this.currentstate.b();
        //System.out.println(this.currentstate);
    }

    public String toString(){
        return ("\nde currentstate = " + this.currentstate);
    }
}

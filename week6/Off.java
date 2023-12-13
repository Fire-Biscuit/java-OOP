package week6;

public class Off extends Context implements State{

    @Override
    public String toString(){
        return "OFF";
    }

    @Override
    public void lp (Context context){
        setState(new Off());
    }

    @Override
    public void sp (Context context){
        setState(new Time());
    }

    @Override
    public void setState(Context InputContext) {
        horlogeState = InputContext;
    }
}

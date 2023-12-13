package week6;

public class Time extends Context implements State{

    @Override
    public String toString(){
        return "TIME";
    }
    @Override
    public void lp (Context context){
        setState(new Off());
    }

    @Override
    public void sp (Context context){
        setState(new Date());
    }

    @Override
    public void setState(Context InputContext) {
        horlogeState = InputContext;
    }
}

package week6;

public class StateMachine extends Context {
    private Context curState;

    public StateMachine(Context startPunt){
        this.curState = startPunt;
        horlogeState = this.curState;
    }

    public void prnt(){
        System.out.println("State = " + horlogeState);
    }

    public void longPress(){
        lp(this.curState);
    }

    public void shortPress(){
        sp(this.curState);
    }

    @Override
    public void sp(Context inputContext) {
        this.curState = inputContext;
        horlogeState.sp(this.curState);
        prnt();
    }

    @Override
    public void lp(Context inputContext) {
        this.curState = inputContext;
        horlogeState.lp(this.curState);
        prnt();
    }

    @Override
    public void setState(Context context) {
        context.setState(this.curState);
    }
}

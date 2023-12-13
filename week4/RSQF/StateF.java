package week4.RSQF;

public class StateF extends State{
    @Override
    public State a() {
        return new StateF();
    }

    @Override
    public State b() {
        return new StateT();
    }

    @Override
    public String toString() {
        return "F";
    }
}

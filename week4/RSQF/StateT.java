package week4.RSQF;

public class StateT extends State{
    @Override
    public State a() {
        return new StateT();
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

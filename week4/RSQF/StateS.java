package week4.RSQF;

public class StateS extends State{
    @Override
    public State a() {
        return new StateQ();
    }

    @Override
    public State b() {
        return new StateF();
    }

    @Override
    public String toString() {
        return "S";
    }
}

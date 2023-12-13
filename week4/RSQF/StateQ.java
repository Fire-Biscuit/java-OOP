package week4.RSQF;

public class StateQ extends State{
    @Override
    public State a() {
        return new StateQ();
    }

    @Override
    public State b() {
        return new StateR();
    }
    @Override
    public String toString() {
        return "Q";
    }
}

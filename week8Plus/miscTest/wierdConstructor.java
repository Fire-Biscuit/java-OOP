package week8Plus.miscTest;

public class wierdConstructor {
    private double i;

    public wierdConstructor(double i){
        this.t();
        this.i = i;
    }

    public wierdConstructor(){
        System.out.println("Default constructor");
        this(1);
    }

    public void t(){
        System.out.println("Invoking t");
    }
}

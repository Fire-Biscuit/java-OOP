package week8Plus.RobotCarDerdeKeer;

import java.util.ArrayList;

public class RobotCar {
    private int x;
    private int y;
    private BaseOrientation orientation;

    public RobotCar() {
        this.x = 0;
        this.y = 0;
        this.setOrientation(new UpwardsOrientation(this));
    }

    public void setOrientation(BaseOrientation orientation) {
        this.orientation = orientation;
    }

    public BaseOrientation getOrientation() {
        return orientation;
    }

    public int adjustXPosition(int change){
        this.x += change;
        return this.x;
    }

    public int adjustYPosition(int change){
        this.y += change;
        return this.y;
    }

    public String toString(){
        return "[" + x + "," + y + "]";
    }

    public void runCommands(ArrayList<Command> commands){
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).handle(this);
        }
    }

    public void runCommands(ArrayList<Command> commands, boolean printOrNot){
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).handle(this);
            if(printOrNot){
                System.out.println(this);
            }
        }
    }
}

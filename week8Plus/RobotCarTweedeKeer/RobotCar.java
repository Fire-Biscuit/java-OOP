package week8Plus.RobotCarTweedeKeer;

import java.util.ArrayList;

public class RobotCar {
    protected int x;
    protected int y;
    protected BaseOrientation orientation;

    public RobotCar() {
        this.setOrientation(new UpwardesOrientation(this));
    }

    public void setOrientation(BaseOrientation orientation) {
        this.orientation = orientation;
    }

    public int adjustXPosition(int input) {
        this.x += input;
        return x;
    }

    public int adjustYPosition(int input) {
        this.y += input;
        return y;
    }

    public void runCommands(ArrayList<Command> commandList, boolean printOrNot) {
        for (int i = 0; i < commandList.size(); i++) {
            commandList.get(i).handle(this);
            if (printOrNot) {
                System.out.printf(this.toString());
            }
        }
    }

    public void runCommands(ArrayList<Command> commandList) {
        for (int i = 0; i < commandList.size(); i++) {
            commandList.get(i).handle(this);
        }
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "]\n";
    }

}

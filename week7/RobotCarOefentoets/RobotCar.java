package week7.RobotCarOefentoets;

import java.util.ArrayList;

public class RobotCar {
    private int x;
    private int y;
    private BaseOrientation orientation;

    public RobotCar(){
        x = 0;
        y = 0;
        this.setOrientation(new UpwardsOrientation(this));
    }

    public void setOrientation(BaseOrientation inputOrientation){
        this.orientation = inputOrientation;
    }

    public BaseOrientation getBaseOrientation() {
        return this.orientation;
    }

    public int adjustXPosition(int forward){
        return this.x += forward;
    }

    public int adjustYPosition(int forward){
        return this.y += forward;
    }

    public void runCommands(ArrayList<Command> commandArrayList){
        for (int i = 0; i < commandArrayList.size(); i++) {
            commandArrayList.get(i).handle(this);
        }
    }

    public void runCommands(ArrayList<Command> commandArrayList, boolean welOfNiet){
        for (int i = 0; i < commandArrayList.size(); i++) {
            commandArrayList.get(i).handle(this);
            if (welOfNiet == true) {
                System.out.printf("[%d,%d]\n", x, y);
            }
        }
    }

    @Override
    public String toString() {
        String omTerugTeGeven = "\n" + this.orientation.getClass().getSimpleName() ;
        return omTerugTeGeven;
    }
}
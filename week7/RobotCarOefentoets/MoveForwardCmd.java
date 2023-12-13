package week7.RobotCarOefentoets;

public class MoveForwardCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getBaseOrientation().moveForwarf();
    }
}

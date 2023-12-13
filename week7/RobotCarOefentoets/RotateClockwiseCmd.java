package week7.RobotCarOefentoets;

public class RotateClockwiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getBaseOrientation().rotateClockWise();
    }
}

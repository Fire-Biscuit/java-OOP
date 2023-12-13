package week7.RobotCarOefentoets;

public class RotateAntiClockwiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getBaseOrientation().rotateAntiClockWise();
    }
}

package week8Plus.RobotCarDerdeKeer;

public class RotateClockWiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getOrientation().rotateClockWise();
    }
}

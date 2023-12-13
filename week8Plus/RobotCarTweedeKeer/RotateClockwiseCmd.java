package week8Plus.RobotCarTweedeKeer;

public class RotateClockwiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.orientation.rotateClockWise();
    }
}

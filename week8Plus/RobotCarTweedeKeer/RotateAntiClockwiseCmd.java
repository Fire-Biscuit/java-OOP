package week8Plus.RobotCarTweedeKeer;

public class RotateAntiClockwiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.orientation.rotateAntiClockWise();
    }
}

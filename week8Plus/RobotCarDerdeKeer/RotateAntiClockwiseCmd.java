package week8Plus.RobotCarDerdeKeer;

public class RotateAntiClockwiseCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getOrientation().rotateAntiClockWise();
    }
}

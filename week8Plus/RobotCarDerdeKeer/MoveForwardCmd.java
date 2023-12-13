package week8Plus.RobotCarDerdeKeer;

public class MoveForwardCmd implements Command{
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.getOrientation().moveForward();
    }
}

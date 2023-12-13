package week8Plus.RobotCarTweedeKeer;

public class MoveForwardCmd implements Command {
    @Override
    public void handle(RobotCar robotCar) {
        robotCar.orientation.moveForward();
    }
}

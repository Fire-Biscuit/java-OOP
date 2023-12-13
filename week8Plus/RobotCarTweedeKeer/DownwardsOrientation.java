package week8Plus.RobotCarTweedeKeer;

public class DownwardsOrientation extends BaseOrientation{
    public DownwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }
    @Override
    public void rotateClockWise(){
        robotCar.setOrientation(new LeftwardsOrientation(robotCar));
    };
    @Override
    public void rotateAntiClockWise(){
        robotCar.setOrientation(new RightwardsOrientation(robotCar));
    };
    @Override
    public void moveForward(){
        robotCar.adjustYPosition(-1);
    };
}

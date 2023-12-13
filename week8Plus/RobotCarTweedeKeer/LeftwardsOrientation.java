package week8Plus.RobotCarTweedeKeer;

public class LeftwardsOrientation extends BaseOrientation{
    public LeftwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }

    @Override
    public void rotateClockWise(){
        robotCar.setOrientation(new UpwardesOrientation(robotCar));
    };
    @Override
    public void rotateAntiClockWise(){
        robotCar.setOrientation(new DownwardsOrientation(robotCar));
    };
    @Override
    public void moveForward(){
        robotCar.adjustXPosition(-1);
    };
}

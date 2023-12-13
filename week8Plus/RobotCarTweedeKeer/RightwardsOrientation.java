package week8Plus.RobotCarTweedeKeer;

public class RightwardsOrientation extends BaseOrientation{
    public RightwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }
    @Override
    public void rotateClockWise(){
        robotCar.setOrientation(new DownwardsOrientation(robotCar));
    }

    @Override
    public void rotateAntiClockWise(){
        robotCar.setOrientation(new UpwardesOrientation(robotCar));
    }
    @Override
    public void moveForward(){
        robotCar.adjustXPosition(1);
    }
}

package week8Plus.RobotCarTweedeKeer;

public class UpwardesOrientation extends BaseOrientation{

    public UpwardesOrientation(RobotCar robotCar) {
        super(robotCar);
    }
    @Override
    public void rotateClockWise(){
        robotCar.setOrientation(new RightwardsOrientation(robotCar));
    };
    @Override
    public void rotateAntiClockWise(){
        robotCar.setOrientation(new LeftwardsOrientation(robotCar));
    };
    @Override
    public void moveForward(){
        robotCar.adjustYPosition(1);
    };

}

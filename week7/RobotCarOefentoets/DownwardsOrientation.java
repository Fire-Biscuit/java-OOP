package week7.RobotCarOefentoets;

public class DownwardsOrientation extends BaseOrientation{

    public DownwardsOrientation(RobotCar robotCar){
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        robotCar.setOrientation(new LeftwardsOrientation(robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        robotCar.setOrientation(new RightwardsOrientation(robotCar));
    }

    @Override
    void moveForwarf() {
        robotCar.adjustYPosition(-1);
    }
}

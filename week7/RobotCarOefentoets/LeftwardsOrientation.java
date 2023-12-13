package week7.RobotCarOefentoets;

public class LeftwardsOrientation extends BaseOrientation{

    public LeftwardsOrientation(RobotCar robotCar){
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        robotCar.setOrientation(new UpwardsOrientation(robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        robotCar.setOrientation(new DownwardsOrientation(robotCar));
    }

    @Override
    void moveForwarf() {
        robotCar.adjustXPosition(-1);
    }
}

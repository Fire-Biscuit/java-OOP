package week7.RobotCarOefentoets;

public class RightwardsOrientation extends BaseOrientation{

    public RightwardsOrientation(RobotCar robotCar){
        super(robotCar);
    }
    @Override
    void rotateClockWise() {
        robotCar.setOrientation(new DownwardsOrientation(robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        robotCar.setOrientation(new UpwardsOrientation(robotCar));
    }

    @Override
    void moveForwarf() {
        robotCar.adjustXPosition(1);
    }
}

package week7.RobotCarOefentoets;

public class UpwardsOrientation extends  BaseOrientation{

    public UpwardsOrientation(RobotCar robotCar){
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        robotCar.setOrientation(new RightwardsOrientation(robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        robotCar.setOrientation(new LeftwardsOrientation(robotCar));
    }

    @Override
    void moveForwarf() {
        robotCar.adjustYPosition(1);
    }
}

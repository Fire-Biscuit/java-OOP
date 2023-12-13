package week8Plus.RobotCarDerdeKeer;

public class UpwardsOrientation extends  BaseOrientation{

    public UpwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        robotCar.setOrientation(new RightwardsOrientation(this.robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        robotCar.setOrientation(new LeftwardsOrientation(this.robotCar));
    }

    @Override
    void moveForward() {
        this.robotCar.adjustYPosition(1);
    }
}

package week8Plus.RobotCarDerdeKeer;

public class DownwardsOrientation extends BaseOrientation{

    public DownwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        this.robotCar.setOrientation(new LeftwardsOrientation(this.robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        this.robotCar.setOrientation(new RightwardsOrientation(this.robotCar));
    }

    @Override
    void moveForward() {
        this.robotCar.adjustYPosition(-1);
    }
}

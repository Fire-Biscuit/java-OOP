package week8Plus.RobotCarDerdeKeer;

public class LeftwardsOrientation extends BaseOrientation{

    public LeftwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        this.robotCar.setOrientation(new UpwardsOrientation(this.robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        this.robotCar.setOrientation(new DownwardsOrientation(this.robotCar));
    }

    @Override
    void moveForward() {
        this.robotCar.adjustXPosition(-1);
    }
}

package week8Plus.RobotCarDerdeKeer;

public class RightwardsOrientation extends BaseOrientation {


    public RightwardsOrientation(RobotCar robotCar) {
        super(robotCar);
    }

    @Override
    void rotateClockWise() {
        this.robotCar.setOrientation(new DownwardsOrientation(this.robotCar));
    }

    @Override
    void rotateAntiClockWise() {
        this.robotCar.setOrientation(new UpwardsOrientation(this.robotCar));
    }

    @Override
    void moveForward() {
        this.robotCar.adjustXPosition(-1);
    }
}

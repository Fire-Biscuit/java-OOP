package week8Plus.RobotCarDerdeKeer;

abstract class BaseOrientation {
    protected RobotCar robotCar;
    public BaseOrientation(RobotCar robotCar){
        this.robotCar = robotCar;
    }
    abstract void rotateClockWise();
    abstract void rotateAntiClockWise();
    abstract void moveForward();
}

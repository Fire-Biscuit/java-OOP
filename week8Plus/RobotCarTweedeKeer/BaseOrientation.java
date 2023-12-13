package week8Plus.RobotCarTweedeKeer;

abstract class BaseOrientation {
    protected RobotCar robotCar;
    public BaseOrientation(RobotCar robotCar){
        this.robotCar = robotCar;
    }

    public void rotateClockWise(){};

    public void rotateAntiClockWise(){};

    public void moveForward(){};

}

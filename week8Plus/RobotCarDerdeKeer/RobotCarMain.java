package week8Plus.RobotCarDerdeKeer;

import java.util.ArrayList;

public class RobotCarMain {
    public static void main(String[] args) {
        System.out.println("Mike Schardijn 500911074 IT101");
        RobotCar robotCar = new RobotCar();

        ArrayList commandList = new ArrayList();
        commandList.add(new MoveForwardCmd()); // [0,1]
        commandList.add(new MoveForwardCmd()); // [0,2]
        commandList.add(new RotateAntiClockwiseCmd()); // from UP to LEFT
        commandList.add(new MoveForwardCmd()); // [-1,2]
        commandList.add(new MoveForwardCmd()); // [-2,2]

        robotCar.runCommands(commandList, true); // Meaning of boolean: true? print coordinates after every command

        System.out.println(robotCar); // prints: coordinates: [-2, 2]
    }
}
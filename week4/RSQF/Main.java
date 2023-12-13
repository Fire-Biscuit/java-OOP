package week4.RSQF;

public class Main {
    public static void main(String[] args) {
        //this makes a statemachine object and prints out it's currentstate
        Machine machine = new Machine();
        System.out.println(machine);

        //this randomly gives an "a" or an "b" 20 times for the stateMachine path
        for (int i = 0; i < 20; i++) {
            double nummer = Math.random();
            if (nummer >= 0.5){
                machine.processA();
                System.out.print("a");
            } else {
                machine.processB();
                System.out.print("b");
            }
        }
        //this prints out the currentstate
        System.out.println(machine);

    }
}

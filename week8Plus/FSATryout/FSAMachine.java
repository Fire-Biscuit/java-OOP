package week8Plus.FSATryout;

public class FSAMachine {

    void fsaExec(String input) {
        boolean[] acceptState = {false, false, false, true};

        int[][] tranTab = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };
        System.out.println("print the input string");
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char inchar = input.charAt(i);
            int incharIndex = inchar - 'a';
            state = tranTab[state][incharIndex];
        }
        System.out.println(acceptState[state]);
    }
}

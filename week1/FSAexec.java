package week1;
//test
/**
 * Zie de DLO practicum opgaven voor instricties.
 * TODO: make it better and understand the working. Add comments and change/add/refactor code.
 * Use flaci to draw FSA/NFA diagram with transition table and add images to your documentation.
 * Use more output to show the working of this app like:
 * Test input ababaxaaba
 * input=a current state=0
 * input=b current state=1 etc..
 *
 */
public class FSAexec {

    public static void main(String[] args) {
        new FSAexec().fsaExec("abcabaaaba");
    }

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

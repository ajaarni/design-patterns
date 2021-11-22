import java.util.Scanner;
/**
 * @ajaarni
 * @author Anton Aarnink
 * CSCE 247 002
 */

public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner scanner;

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
    }
    
    public void pressQuestionButton() {
        


    }

    public void setState(State state) {
        this.state = state;
        
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }

}

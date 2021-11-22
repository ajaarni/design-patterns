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
/**
 * constructor
 */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        scanner = new Scanner(System.in);
    }
    
    /**
     * gets the random numbers and save the users anwser 
     * updates score and state acourdingly 
     */
    public void pressQuestionButton() {
        int numOne = state.getNum();
        String opp = state.getOperation();
        int numTwo = state.getNum();
        int result = numOne + numTwo;
        state = easyState;
        

        System.out.println(numOne + opp + numTwo);
        int anw = scanner.nextInt();
        
        if(anw == result) {
            System.out.println("correct");
            score++;

        }
        else{
            System.out.println("sorry try again");
            score--;
        }

        if(score >= 3) {
            state.levelUp();
            score = 0;
        }
        else if(score <= -3) {
            state.levelDown();
            score = 0;
        }


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

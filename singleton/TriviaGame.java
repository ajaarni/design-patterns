import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Anton Aarnink
 * CSCE247 002
 */

public class TriviaGame extends DataLoader{
    private TriviaGame triviaGame;
    private int score = 0;
    private Random random;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * initilizes the random and scanner objects
     * and loads questions into questions arraylist
     */
    private TriviaGame() {
        random = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the trivia game!!");


        questions = new ArrayList<Question>();
        questions.add(Question.DataLoader());

    }

    /**
     * 
     * @return the instance of the current trivia game 
     */
    public TriviaGame getInstance() {
        return triviaGame;
        
    }

    /**
     * checks the useres response to wanting to play again and then 
     * prints score and exits if they want to quit
     */
    public void play() {
        System.out.println("Would you like to (P)lay or (Q)uit? ");
        String response = reader.nextLine();
        while(response != "Q") {
            playRound();
        }
        System.out.println("Thank you for playing you score was" + score);
        System.exit(0);


    }

    /**
     * 
     * @return true if the anwser is correct and false if not
     * increments score by one if right 
     */
    private boolean playRound() {
       String question = random.questions();

       System.out.println("Choose Anwser");
       int anwser = reader.nextInt();
       if(anwser.isCorrect()) {
           System.out.println("Cograts thats right!!");
           return true;
           score++;

       }
       else {
           return false;
       }
       

       
        
    }
    

}

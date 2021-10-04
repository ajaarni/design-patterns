/**
 * @author Anton Aarnink
 * CSCE247 002
 */

public class Question {
    private String question;
    private String[] anwsers;
    private int correctAnwser;

    /**
     * 
     * @param question the given question 
     * @param ans1 anwser choice 
     * @param ans2 anwser choice 
     * @param ans3 anwser choice 
     * @param ans4 anwser choice 
     * @param correctAnwser anwser choice deemed right by txt file
     * 
     * populates the anwsers array with the choices
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnwser) {
        this.question = question;
        this.anwsers = new String[4];
            anwsers[0] = ans1;
            anwsers[1] = ans2;
            anwsers[2] = ans3;
            anwsers[3] = ans4;
        this.correctAnwser = correctAnwser;

    }

    /**
     * prints the question and anwsers
     */
    public String toString() {
        
        return question + "\n" + anwsers;

    }

    /**
     * 
     * @param userAnwser the anwser given by the user 
     * @return true is correct false if not 
     */
    public boolean isCorrect(int userAnwser) {
        if(userAnwser == correctAnwser+1)
            return true;
        else 
            return false;


    }

    public String getCorrectAnswer() {
        return correctAnwser;

    }

    



}
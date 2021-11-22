import java.util.Random;

public class Easy implements State {

    private ArithemeticGame game;
    private Random rand;

    public Easy(ArithemeticGame game) {
        this.game = game;
        this.rand = new Random();

    }

    /**
     * gets random number less than or equal to 10
     */
    @Override
    public int getNum() {
        int upper = 10;
        return rand.nextInt(upper);
    }

     /**
     * gets a random opperator from array of operators 
     */
    @Override
    public String getOperation() {
        String[] arr = {"+","-"};
        int select = rand.nextInt(arr.length);
        return arr[select];
    }


    /**
     * move game mode to medium
     */
    @Override
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to the medium mode.");
        
    }

    /**
     * keeps game mode at easy 
     */
    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
        
    }
    
}

import java.util.Random;

public class Hard implements State {

    private ArithemeticGame game;
    private Random rand;

    public Hard(ArithemeticGame game) {
        this.game = game;
        this.rand = new Random();
    }
    /**
     * gets random number less than or equal to 100
     */
    @Override
    public int getNum() {
        int upper = 100;
        return rand.nextInt(upper);
    }

    /**
     * gets a random opperator from array of operators 
     */
    @Override
    public String getOperation() {
        String[] arr = {"+","-","*","/"};
        int select = rand.nextInt(arr.length);
        return arr[select];
    }

    /**
     * keeps game mode at hard
     */
    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * move game mode to easy 
     */
    @Override
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
    
}

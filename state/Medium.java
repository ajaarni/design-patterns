import java.util.Random;

public class Medium implements State {

    private ArithemeticGame game;
    private Random rand;

    public Medium(ArithemeticGame game) {
        this.game = game;
        this.rand = new Random();
    }

    /**
     * gets random number less than or equal to 50
     */
    @Override
    public int getNum() {
        int upper = 50;
        return rand.nextInt(upper);
    }

    /**
     * gets a random opperator from array of operators 
     */
    @Override
    public String getOperation() {
        String[] arr = {"+","-","*"};
        int select = rand.nextInt(arr.length);
        return arr[select];
    }

    /**
     * moves game mode to hard
     */
    @Override
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    /**
     * moves game mode to easy 
     */
    @Override
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}

import java.util.Random;

public class Hard implements State {

    private ArithemeticGame game;
    private Random rand;

    public Hard(ArithemeticGame game) {
        this.game = game;
        this.rand = new Random();
    }

    @Override
    public int getNum() {
        int upper = 100;
        return rand.nextInt(upper);
    }

    @Override
    public String getOperation() {
        String[] arr = {"+","-","*","/"};
        int select = rand.nextInt(arr.length);
        return arr[select];
    }

    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    @Override
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
    
}

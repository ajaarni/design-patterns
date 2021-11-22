import java.util.Random;

public class Medium implements State {

    private ArithemeticGame game;
    private Random rand;

    public Medium(ArithemeticGame game) {
        this.game = game;
        this.rand = new Random();
    }

    @Override
    public int getNum() {
        int upper = 50;
        return rand.nextInt(upper);
    }

    @Override
    public String getOperation() {
        String[] arr = {"+","-","*"};
        int select = rand.nextInt(arr.length);
        return arr[select];
    }

    @Override
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    @Override
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}

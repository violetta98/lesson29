package TemplateMethod;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Chess extends Game {

    @Override
    protected void initGame() {
        System.out.println("Chess - init");
    }

    @Override
    protected void playGame() {
        System.out.println("Chess - play");
    }

    @Override
    protected void endGame() {
        System.out.println("Chess - end");
    }

    @Override
    protected void printWinner() {
        System.out.println("Chess - winner");
    }

}

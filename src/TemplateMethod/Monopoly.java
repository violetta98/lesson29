package TemplateMethod;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Monopoly extends Game {

    @Override
    protected void initGame() {
        System.out.println("Monopoly - init");
    }

    @Override
    protected void playGame() {
        System.out.println("Monopoly - play");
    }

    @Override
    protected void endGame() {
        System.out.println("Monopoly - end");
    }

    @Override
    protected void printWinner() {
        System.out.println("Monopoly - winner");
    }

}

package TemplateMethod;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public abstract class Game {

    private int playersAmount;

    protected abstract void initGame();

    protected abstract void playGame();

    protected abstract void endGame();

    protected abstract void printWinner();

    public final void playOneGame(int playersAmount) {
        setPlayersAmount(playersAmount);
        initGame();
        playGame();
        endGame();
        printWinner();
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

}

package TemplateMethod;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class GamesManager {

    public static void main(String[] args) {
        final GameCode gameCode = GameCode.MONOPOLY;
        Game game;
        switch(gameCode) {
            case CHESS:
                game = new Chess();
                break;
            case MONOPOLY:
                game = new Monopoly();
                break;
            default:
                throw new IllegalStateException();
        }
        game.playOneGame(2);
    }

}

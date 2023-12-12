package opgave;

import opgave.libraries.DrawListener;

public class GameController implements DrawListener {

    private Game game;

    public GameController(Game game){
        this.game = game;
    }

    @Override
    public void mouseClicked(double x, double y) {
        Board currentBoard = game.getCurrentBoard();

        System.out.println(x + "  " + y);
        int column=(int)(x/40);
        System.out.println(column);
        // Controleren bij game of het spel nog bezig is en de menselijke speler aan de beurt is
        // Als dit het geval is, doMove aanroepen.
        if (!currentBoard.isFinished()){
            if (game.getCurrentPlayer() == Board.PLAYER1){
                game.doMove(column);
            }
        }

    }
}

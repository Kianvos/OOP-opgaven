package opgave;

import opgave.libraries.Draw;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ViewGraphics implements Observer {

    private Draw draw;

    public ViewGraphics(Draw draw) {
        this.draw = draw;
        for (int col = 0; col < Board.NUMBER_OF_COLS; col++) {
            for (int row = 0; row < Board.NUMBER_OF_ROWS; row++) {
                draw.setPenColor(Color.LIGHT_GRAY);
                draw.filledCircle(20 + col * 40, Board.NUMBER_OF_ROWS * 40 - (row * 40) - 20, 15);
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        Board board = (Board) arg;
        System.out.println("Test?");
        for (int col = 0; col < Board.NUMBER_OF_COLS; col++) {
            for (int row = 0; row < Board.NUMBER_OF_ROWS; row++) {
                if (board.get(col, row) == Board.PLAYER1) {
                    draw.setPenColor(Color.RED);
                } else if (board.get(col, row) == Board.PLAYER2) {
                    draw.setPenColor(Color.YELLOW);
                } else {
                    draw.setPenColor(Color.LIGHT_GRAY);
                }
                draw.filledCircle(20 + col * 40, Board.NUMBER_OF_ROWS * 40 - (row * 40) - 20, 15);
            }
        }
        if (board.isFinished()) {
            draw.setPenColor(Color.BLACK);
            if (board.isWinner(Board.PLAYER1)) {
                draw.text(150, 150, "Gewonnen door mens");
            } else {
                draw.text(150, 150, "Gewonnen door computer");
            }
        }
    }
}

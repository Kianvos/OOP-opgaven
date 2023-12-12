package opgave;

import opgave.libraries.Draw;
import opgave.libraries.StdDraw;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Draw draw = new Draw();
        draw.clear(Color.BLUE);
        draw.setYscale(0, Math.max(Board.NUMBER_OF_COLS,Board.NUMBER_OF_ROWS)*40);
        draw.setXscale(0, Math.max(Board.NUMBER_OF_COLS,Board.NUMBER_OF_ROWS)*40);

        game.addObserver(new ViewConsole());
        game.addObserver(new ViewGraphics(draw));
        draw.addListener(new GameController(game));
        game.runGame();
//        draw.setScale(0, Math.max(Board.NUMBER_OF_COLS,Board.NUMBER_OF_ROWS)*40);

//        DisplayBoard displayBoard = new DisplayBoard();
//        vertical(displayBoard);
//        horizontal(displayBoard);
//        leftToRightTop(displayBoard);
//        rightToLeftTop(displayBoard);
    }

    public static void vertical(DisplayBoard displayBoard){
        Board board = new Board();
        board=board.doMove(Board.PLAYER1, 1);
        board=board.doMove(Board.PLAYER2, 2);
        board=board.doMove(Board.PLAYER1, 1);
        board=board.doMove(Board.PLAYER2, 2);
        board=board.doMove(Board.PLAYER1, 1);
        board=board.doMove(Board.PLAYER2, 2);
        board=board.doMove(Board.PLAYER1, 1);
        System.out.println();
        displayBoard.displayBoard(board);
        System.out.println(board.isWinner(Board.PLAYER2));
    }

    public static void horizontal(DisplayBoard displayBoard){
        Board board = new Board();
        board=board.doMove(Board.PLAYER1, 1);
        board=board.doMove(Board.PLAYER2, 1);
        board=board.doMove(Board.PLAYER1, 2);
        board=board.doMove(Board.PLAYER2, 2);
        board=board.doMove(Board.PLAYER1, 3);
        board=board.doMove(Board.PLAYER2, 3);
        board=board.doMove(Board.PLAYER1, 4);
        System.out.println();
        displayBoard.displayBoard(board);
        System.out.println(board.isWinner(Board.PLAYER2));
    }

    public static void leftToRightTop(DisplayBoard displayBoard){
        //        VERTICAL
        Board board = new Board();
        board=board.doMove(Board.PLAYER1, 1);
        board=board.doMove(Board.PLAYER2, 2);
        board=board.doMove(Board.PLAYER1, 2);
        board=board.doMove(Board.PLAYER2, 3);
        board=board.doMove(Board.PLAYER1, 3);
        board=board.doMove(Board.PLAYER2, 4);
        board=board.doMove(Board.PLAYER1, 3);
        board=board.doMove(Board.PLAYER2, 4);
        board=board.doMove(Board.PLAYER1, 4);
        board=board.doMove(Board.PLAYER2, 0);
        board=board.doMove(Board.PLAYER1, 4);
        System.out.println();
        displayBoard.displayBoard(board);
        System.out.println(board.isWinner(Board.PLAYER2));
    }
    public static void rightToLeftTop(DisplayBoard displayBoard){
        //        VERTICAL
        Board board = new Board();
        //DIAGONAL right to left top
        board = new Board();
        board=board.doMove(Board.PLAYER1, 7);
        board=board.doMove(Board.PLAYER2, 6);
        board=board.doMove(Board.PLAYER1, 6);
        board=board.doMove(Board.PLAYER2, 5);
        board=board.doMove(Board.PLAYER1, 5);
        board=board.doMove(Board.PLAYER2, 4);
        board=board.doMove(Board.PLAYER1, 5);
        board=board.doMove(Board.PLAYER2, 4);
        board=board.doMove(Board.PLAYER1, 4);
        board=board.doMove(Board.PLAYER2, 0);
        board=board.doMove(Board.PLAYER1, 4);
        System.out.println();
        displayBoard.displayBoard(board);
        System.out.println(board.isWinner(Board.PLAYER2));
    }
}

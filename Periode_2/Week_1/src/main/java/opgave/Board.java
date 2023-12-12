package opgave;

public class Board {

    public static final int NONE = 0;
    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;

    public static final int NUMBER_OF_COLS = 8;
    public static final int NUMBER_OF_ROWS = 8;

    private final int[][] board;

    public Board() {
        board = new int[NUMBER_OF_COLS][NUMBER_OF_ROWS];
    }

    public Board(Board board) {
        this();
        // De array wordt gekopiëerd, om onbedoelde wijzigingen in de array van het argument te voorkomen.
        for (int col = 0; col < NUMBER_OF_COLS; col++) {
            for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                this.board[col][row] = board.get(col, row);
            }
        }
    }

    public Board(Board board, int player, int column) {
        this(board);
        if (isValidMove(column)) {
            for (int i = NUMBER_OF_ROWS - 1; i >= 0; i--) {
                if (board.get(column, i) == NONE) {
                    this.board[column][i] = player;
                    break;
                }
            }
            // Verander de array board, zodat een steen van player in column terecht komt.
            // ..(deze code dient te worden aangevuld)
        } else {
            throw new IllegalStateException("Invalid move");
        }
    }

    public Board doMove(int player, int column) {
        return new Board(this, player, column);
    }

    // getter voor een steen op bepaalde positie
    public int get(int column, int row) {
        return board[column][row];
    }

    // kan in de kolom een steen worden geworpen?
    public boolean isValidMove(int column) {
        for (int i = NUMBER_OF_ROWS - 1; i >= 0; i--) {
            if (board[column][i] == NONE) {
                return true;
            }
        }
        return false;
    }

    // is het spel afgelopen?
    public boolean isFinished() {
        if (isWinner(PLAYER1) || isWinner(PLAYER2)) {
            return true;
        }
        for (int i = 0; i < NUMBER_OF_COLS; i++) {
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                if (board[i][j] == NONE) {
                    return false;
                }
            }
        }
        return true;
    }

    // heeft player gewonnen?
    public boolean isWinner(int player) {
        if (horizontalWinner(player)) {
            return true;
        } else if (verticalWinner(player)) {
            return true;
        } else if (diagonalLeftTopRight(player)){
            return true;
        }
        return diagonalRightTopLeft(player);
    }

    public boolean horizontalWinner(int player) {
        for (int i = 0; i < NUMBER_OF_COLS; i++) {
            int tmp = 0;
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                if (board[j][i] != player) {
                    tmp = 0;
                } else {
                    tmp++;
                    if (tmp == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean verticalWinner(int player) {
        for (int i = 0; i < NUMBER_OF_COLS; i++) {
            int tmp = 0;
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                if (board[i][j] != player) {
                    tmp = 0;
                } else {
                    tmp++;
                    if (tmp == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public boolean diagonalLeftTopRight(int player) {

        for (int i = NUMBER_OF_COLS - 1; i >= 0; i--) {
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                int tmpCol = i;
                int tmpRow = j;
                int tmp = 0;
                while (tmpRow >= 0 && tmpRow < NUMBER_OF_ROWS && tmpCol >= 0 && tmpCol < NUMBER_OF_COLS) {
                    if (board[tmpCol][tmpRow] != player) {
                        tmp = 0;
                    } else {
                        tmp++;
                        if (tmp == 4) {
                            return true;
                        }
                    }
                    tmpCol--;
                    tmpRow++;
                }
            }
        }
        return false;
    }

    public boolean diagonalRightTopLeft(int player) {
        for (int i = 0; i < NUMBER_OF_COLS; i++) {
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                int tmpCol = i;
                int tmpRow = j;
                int tmp = 0;
                while (tmpRow >= 0 && tmpRow < NUMBER_OF_ROWS && tmpCol >= 0 && tmpCol < NUMBER_OF_COLS) {
                    if (board[tmpCol][tmpRow] != player) {
                        tmp = 0;
                    } else {
                        tmp++;
                        if (tmp == 4) {
                            return true;
                        }
                    }
                    tmpCol++;
                    tmpRow++;
                }
            }
        }
        return false;
    }

}

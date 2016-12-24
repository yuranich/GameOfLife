package ru.sbt.edu;

public class GameOfLife {
    private byte[][] board;

    public static void main(String[] args) {
        new Testing().runAllTests();
        int N = 10;
        Random rand = new Random();
        byte[][] board = new byte[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = (byte) (rand.nextInt() % 2);
            }
        }
//        board[5][5] = 1;
//        board[4][5] = 1;
//        board[6][5] = 1;
//        board[4][6] = 1;
//        board[4][7] = 1;


        GameOfLife gameOfLife = new GameOfLife(board);
        long startBig = System.currentTimeMillis();

        gameOfLife.printBoard();
        System.out.println();
        long timeConsumedMillis = 0;
        for (int i = 0; i < 1000; i++) {
            long start = System.currentTimeMillis();
            gameOfLife.computeNextState();
            gameOfLife.printBoard();
            System.out.println();
//            long finish = System.currentTimeMillis();
//            timeConsumedMillis = finish - start;
        }
        long finishBig = System.currentTimeMillis();
        long timeConsumedMillisBig = (finishBig - startBig) / 1000;
//        System.out.println(timeConsumedMillis);
        System.out.println(timeConsumedMillisBig);


    }

    public GameOfLife(byte[][] initial) {
        board = initial;
    }

    public byte[][] computeNextState() {
        byte[][] sums = new byte[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                sums[i][j] = computeSumOfNeighb(i, j, board);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (sums[i][j] != 2 && sums[i][j] != 3) {
                        board[i][j] = 0;
                    }
                } else {
                    if (sums[i][j] == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
        return board;
    }

    private byte computeSumOfNeighb(int i, int j, byte[][] board) {
        byte state = board[i][j];
        int lastRow = board.length - 1;
        int lastCol = board[0].length - 1;
        int sum = 0;
        if (i == 0) {
            if (j == 0) {
                sum = board[0][1] +
                        board[1][0] +
                        board[1][1] +
                        board[lastRow][0] +
                        board[lastRow][1] +
                        board[0][lastCol] +
                        board[1][lastCol] +
                        board[lastRow][lastCol];
            } else if (j == lastCol) {
                sum = board[1][lastCol] +
                        board[1][lastCol - 1] +
                        board[0][lastCol - 1] +
                        board[lastRow][lastCol] +
                        board[lastRow][lastCol - 1] +
                        board[0][0] +
                        board[1][0] +
                        board[lastRow][0];
            } else {
                sum = board[1][j] +
                        board[1][j - 1] +
                        board[1][j + 1] +
                        board[0][j + 1] +
                        board[0][j - 1] +
                        board[lastRow][j] +
                        board[lastRow][j - 1] +
                        board[lastRow][j + 1];
            }
        } else if (i == lastRow) {
            if (j == 0) {
                sum = board[lastRow - 1][1] +
                        board[lastRow - 1][0] +
                        board[lastRow][1] +
                        board[0][0] +
                        board[0][1] +
                        board[lastRow][lastCol] +
                        board[lastRow - 1][lastCol] +
                        board[0][lastCol];
            } else if (j == lastCol) {
                sum = board[lastRow - 1][lastCol] +
                        board[lastRow - 1][lastCol - 1] +
                        board[lastRow][lastCol - 1] +
                        board[0][lastCol] +
                        board[0][lastCol - 1] +
                        board[lastRow][0] +
                        board[lastRow - 1][0] +
                        board[0][0];
            } else {
                sum = board[lastRow - 1][j] +
                        board[lastRow - 1][j - 1] +
                        board[lastRow - 1][j + 1] +
                        board[lastRow][j + 1] +
                        board[lastRow][j - 1] +
                        board[0][j] +
                        board[0][j - 1] +
                        board[0][j + 1];
            }
        } else {
            if (j == 0) {
                sum = board[i][1] +
                        board[i - 1][0] +
                        board[i - 1][1] +
                        board[i + 1][0] +
                        board[i + 1][1] +
                        board[i][lastCol] +
                        board[i - 1][lastCol] +
                        board[i + 1][lastCol];
            } else if (j == lastCol) {
                sum = board[i][lastCol - 1] +
                        board[i - 1][lastCol] +
                        board[i - 1][lastCol - 1] +
                        board[i + 1][lastCol] +
                        board[i + 1][lastCol - 1] +
                        board[i][0] +
                        board[i - 1][0] +
                        board[i + 1][0];
            } else {
                sum = board[i - 1][j] +
                        board[i - 1][j - 1] +
                        board[i - 1][j + 1] +
                        board[i + 1][j] +
                        board[i + 1][j + 1] +
                        board[i + 1][j - 1] +
                        board[i][j - 1] +
                        board[i][j + 1];
            }
        }
        return (byte) sum;
    }

    public void printBoard() {
        Testing t = new Testing();
        t.printBoard(board);
    }
}

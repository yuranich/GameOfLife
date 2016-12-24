package ru.sbt.edu;

public class Testing {
    private byte[][] test1 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
    private byte[][] test1step1 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
    private byte[][] test1step2 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};

    private byte[][] test2 = {{0, 0, 1, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test2step1 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test2step2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    private byte[][] test3 = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
    private byte[][] test3step1 = {{0, 0, 0, 0}, {0, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test3step2 = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};

    private byte[][] test4 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test4step1 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
    private byte[][] test4step2 = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};

    private byte[][] test5 = {{0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test5step1 = {{0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    private byte[][] test5step2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    private byte[][] test6 = {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test6step1 = {{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test6step2 = {{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test6step3 = {{0, 1, 1, 0, 0}, {1, 0, 0, 1, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test6step4 = {{0, 1, 1, 0, 0}, {1, 0, 0, 1, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

    private byte[][] test7 = {{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test7step1 = {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test7step2 = {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 0, 1, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test7step3 = {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 0, 1, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

    private byte[][] test8 = {{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test8step1 = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test8step2 = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test8step3 = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test8step4 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private byte[][] test8step5 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

    public void runAllTests() {
        runTest1();
        runTest2();
        runTest3();
        runTest4();
        runTest5();
        runTest6();
        runTest7();
        runTest8();
    }

    public void runTest1() {
        GameOfLife game = new GameOfLife(test1);

        if (!executeTestStep(game, test1step1, 1)) {
            System.out.println("Test 1: FAILURE");
            return;
        }
        if (!executeTestStep(game, test1step2, 2)) {
            System.out.println("Test 1: FAILURE");
            return;
        }
        System.out.println("Test 1: SUCCESS");
    }

    public void runTest2() {
        GameOfLife game = new GameOfLife(test2);

        if (!executeTestStep(game, test2step1, 1)) {
            System.out.println("Test 2: FAILURE");
            return;
        }
        if (!executeTestStep(game, test2step2, 2)) {
            System.out.println("Test 2: FAILURE");
            return;
        }
        System.out.println("Test 2: SUCCESS");
    }

    public void runTest3() {
        GameOfLife game = new GameOfLife(test3);

        if (!executeTestStep(game, test3step1, 1)) {
            System.out.println("Test 3: FAILURE");
            return;
        }
        if (!executeTestStep(game, test3step2, 2)) {
            System.out.println("Test 3: FAILURE");
            return;
        }
        System.out.println("Test 3: SUCCESS");
    }

    public void runTest4() {
        GameOfLife game = new GameOfLife(test4);

        if (!executeTestStep(game, test4step1, 1)) {
            System.out.println("Test 4: FAILURE");
            return;
        }
        if (!executeTestStep(game, test4step2, 2)) {
            System.out.println("Test 4: FAILURE");
            return;
        }
        System.out.println("Test 4: SUCCESS");
    }

    public void runTest5() {
        GameOfLife game = new GameOfLife(test5);

        if (!executeTestStep(game, test5step1, 1)) {
            System.out.println("Test 5: FAILURE");
            return;
        }
        if (!executeTestStep(game, test5step2, 2)) {
            System.out.println("Test 5: FAILURE");
            return;
        }
        System.out.println("Test 5: SUCCESS");
    }

    public void runTest6() {
        GameOfLife game = new GameOfLife(test6);

        if (!executeTestStep(game, test6step1, 1)) {
            System.out.println("Test 6: FAILURE");
            return;
        }
        if (!executeTestStep(game, test6step2, 2)) {
            System.out.println("Test 6: FAILURE");
            return;
        }
        if (!executeTestStep(game, test6step3, 3)) {
            System.out.println("Test 6: FAILURE");
            return;
        }
        if (!executeTestStep(game, test6step4, 4)) {
            System.out.println("Test 6: FAILURE");
            return;
        }
        System.out.println("Test 6: SUCCESS");
    }

    public void runTest7() {
        GameOfLife game = new GameOfLife(test7);

        if (!executeTestStep(game, test7step1, 1)) {
            System.out.println("Test 7: FAILURE");
            return;
        }
        if (!executeTestStep(game, test7step2, 2)) {
            System.out.println("Test 7: FAILURE");
            return;
        }
        if (!executeTestStep(game, test7step3, 3)) {
            System.out.println("Test 7: FAILURE");
            return;
        }
        System.out.println("Test 7: SUCCESS");
    }

    public void runTest8() {
        GameOfLife game = new GameOfLife(test8);

        if (!executeTestStep(game, test8step1, 1)) {
            System.out.println("Test 8: FAILURE");
            return;
        }
        if (!executeTestStep(game, test8step2, 2)) {
            System.out.println("Test 8: FAILURE");
            return;
        }
        if (!executeTestStep(game, test8step3, 3)) {
            System.out.println("Test 8: FAILURE");
            return;
        }
        if (!executeTestStep(game, test8step4, 4)) {
            System.out.println("Test 8: FAILURE");
            return;
        }
        if (!executeTestStep(game, test8step5, 5)) {
            System.out.println("Test 8: FAILURE");
            return;
        }
        System.out.println("Test 8: SUCCESS");
    }

    private static boolean executeTestStep(GameOfLife game, byte[][] expected, int stepNumber) {
        byte[][] step = game.computeNextState();
        if (!checkResult(step, expected)) {
            System.out.println("Test failed on step " + stepNumber + "!!!");
            System.out.println("Actual:");
            printBoard(step);
            System.out.println("Expected:");
            printBoard(expected);
            return false;
        }
        return true;
    }

    private static boolean checkResult(byte[][] actual, byte[][] right) {
        int rows = actual.length;
        int cols = actual[0].length;

        if (rows != right.length || cols != right[0].length) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (actual[i][j] != right[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(byte[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

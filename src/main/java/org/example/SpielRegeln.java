package org.example;

public class SpielRegeln {
    private Zelle[][] board;

    public SpielRegeln(Zelle[][] board) {
        this.board = board;
    }


    public void regeln(Zelle[][] nextGen, int lebendeNachbarn, int x, int y) {

        if (board[x][y].leben()) {
            if (lebendeNachbarn < 2 || lebendeNachbarn > 3) {
                nextGen[x][y] = new ZelleTot();
            } else {
                nextGen[x][y] = new ZelleLebend();
            }
        } else {
            if (lebendeNachbarn == 3) {
                nextGen[x][y] = new ZelleLebend();
            } else {
                nextGen[x][y] = new ZelleTot();
            }
        }
    }
}

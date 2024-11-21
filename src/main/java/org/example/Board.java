package org.example;

public class Board implements BoardInterface, Zelle {

    Zelle[][] board = new Zelle[10][10];


    public Board() {

        for (int zeile = 0; zeile < board.length; zeile++) {
            for (int spalte = 0; spalte < board[0].length; spalte++) {
                board[zeile][spalte] = new ZelleTot();
            }
        }
        board[4][4] = new ZelleLebend();
        board[5][4] = new ZelleLebend();
        board[6][4] = new ZelleLebend();
        board[5][3] = new ZelleLebend();
    }


    public void makeBoard() {
        Zelle[][] nextGen = new Zelle[board.length][board[0].length];
        SpielRegeln spielRegeln = new SpielRegeln(board);

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                int lebendeNachbarn = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (!(i == 0 && j == 0)) {
                            int nachbarX = x + i;
                            int nachbarY = y + j;

                            if (nachbarX >= 0 && nachbarX < board.length && nachbarY >= 0 && nachbarY < board[x].length) {
                                if (board[nachbarX][nachbarY] != null && board[nachbarX][nachbarY].leben()) {
                                    lebendeNachbarn++;
                                }
                            }
                        }
                        spielRegeln.regeln(nextGen, lebendeNachbarn, x, y);
                    }
                }
            }
        }

        board = nextGen;
    }


    public boolean leben() {
        return false;
    }

    @Override
    public String toString() {
        String ausgabe = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null && board[i][j].leben()) {
                    ausgabe += ("\uD83D\uDFE5" + " ");
                } else {
                    ausgabe += ("⬜" + " ");
                }
            }
            ausgabe += "\n";
        }
        return ausgabe;
    }
}

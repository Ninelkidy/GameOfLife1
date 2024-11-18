package org.example;

public class Grid{

    public int board[][];

    public Grid(){
        board = new int[10][10];
        board[2][4] = 1;
        board[3][4] = 1;
        board[6][8] = 1;
        board[1][4] = 1;
        board[2][9] = 1;
        board[3][9] = 1;
        board[3][8] = 1;
        board[2][8] = 1;
        board[5][2] = 1;
        board[5][4] = 1;
        board[6][2] = 1;
        board[2][2] = 1;
        board[3][2] = 1;
        board[3][3] = 1;
        board[8][8] = 1;
        board[8][9] = 1;
        board[9][8] = 1;
        board[6][7] = 1;
        board[7][6] = 1;
        board[7][8] = 1;
        board[6][6] = 1;
        board[0][0] = 1;
        board[0][1] = 1;
    }


    public void printi(){
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    System.out.print("⬜" + " ");
                }else{
                    System.out.print("\uD83D\uDFEA" + " ");
                }}
            System.out.println();
        }}


    public void makeBoard(){
        int[][] nextGen = new int[board.length][board[0].length];

        for(int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                int lebendeNachbarn = 0;
                for(int i = -1; i <= 1; i++) {
                    for(int j = -1; j <= 1; j++) {
                        if(i == 0 && j == 0) {
                            continue;
                        }
                        int nachbarX = x + i;
                        int nachbarY = y + j;
                        if(nachbarX >= 0 && nachbarX < board.length && nachbarY >= 0 && nachbarY < board[x].length) {
                            if (board[nachbarX][nachbarY] == 1) {
                                lebendeNachbarn++;
                            }}}}

                if(lebendeNachbarn < 2 && board[x][y] == 1){
                    nextGen[x][y] = 0;
                }
                if((lebendeNachbarn == 2 || lebendeNachbarn == 3) && board[x][y] == 1){
                    nextGen[x][y] = 1;
                }
                if(lebendeNachbarn > 3 && board[x][y] == 1){
                    nextGen[x][y] = 0;
                }
                if(lebendeNachbarn == 3 && board[x][y] == 0){
                    nextGen[x][y] = 1;
                }}}

        // Updati das Boardi
        board = nextGen;
    }


}

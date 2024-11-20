package org.example;

public class Board implements BoardInterface{

    Zelle[][] board = new Zelle[10][10];

    public Board(){

        for (int zeile = 0; zeile < board.length; zeile++) {
            for (int spalte = 0; spalte < board[0].length; spalte++) {
                board[zeile][spalte] = ZelleTot.generateToteZelle();
            }}
        board[4][4] = ZelleLebend.generateLebendeZelle();
        board[5][4] = ZelleLebend.generateLebendeZelle();
        board[6][4] = ZelleLebend.generateLebendeZelle();
        board[5][3] = ZelleLebend.generateLebendeZelle();

    }

    public void printi(){
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != null && board[i][j].leben()) {
                    System.out.print("\uD83D\uDFE5" + " ");
                }else{
                    System.out.print("⬜" + " ");
                }}
            System.out.println();
        }
        System.out.println();
    }

    public void makeBoard(){
        Zelle[][] nextGen = new Zelle[board.length][board[0].length];


        for(int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                int lebendeNachbarn = 0;

                for(int i = -1; i <= 1; i++) {
                    for(int j = -1; j <= 1; j++) {
                        if(!(i == 0 && j == 0)){
                        int nachbarX = x + i;
                        int nachbarY = y + j;

                        if(nachbarX >= 0 && nachbarX < board.length && nachbarY >= 0 && nachbarY < board[x].length){
                            if (board[nachbarX][nachbarY] != null && board[nachbarX][nachbarY].leben()) {
                                lebendeNachbarn++;
                            }}}}
                }
                if(board[x][y].leben()){
                    if (lebendeNachbarn < 2 || lebendeNachbarn > 3) {
                        nextGen[x][y] = ZelleTot.generateToteZelle();
                    } else {
                        nextGen[x][y] = ZelleLebend.generateLebendeZelle();
                    }
                }
                else {
                    if (lebendeNachbarn == 3) {
                        nextGen[x][y] = ZelleLebend.generateLebendeZelle();
                    } else {
                        nextGen[x][y] = ZelleTot.generateToteZelle();
                    }
                }
            }
        }

                board = nextGen;
    }
        interface Zelle {
                boolean leben();
        }
    }

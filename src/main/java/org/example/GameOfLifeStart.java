package org.example;

public class GameOfLifeStart {
    Board grid;

    public GameOfLifeStart(boolean randomize, int anzahlRandomZellen) {
        this.grid = new Board(randomize, anzahlRandomZellen);
    }

    public void start() throws InterruptedException {
        for (int generations = 1; generations <= 20; generations++) {
            System.out.println(grid);
            System.out.println("Generation " + generations + ":");
            Thread.sleep(500);
            grid.makeBoard();
        }
    }
}
package org.example;

public class GameOfLifeStart {
    BoardInterface grid = new Board();

    public void start() throws InterruptedException {
        for(int generations = 1; generations <= 55; generations++) {
            System.out.println(grid);
            System.out.println("Generation " + generations + ":");
            Thread.sleep(500);
            grid.makeBoard();
        }
    }

}

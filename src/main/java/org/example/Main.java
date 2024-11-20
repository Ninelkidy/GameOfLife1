package org.example;

public class Main{
    public static void main(String[] args) throws InterruptedException{
       BoardInterface grid = new Board();

        for(int generations = 1; generations <= 55; generations++) {
            System.out.println(grid);
            System.out.println("Generation " + generations + ":");
            Thread.sleep(500);
            grid.makeBoard();
        }}}

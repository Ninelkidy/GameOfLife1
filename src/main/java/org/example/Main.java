package org.example;


public class Main{
    public static void main(String[] args) throws InterruptedException{
        Grid grid = new Grid();

        for(int generations = 1; generations <= 70; generations++) {

            System.out.println("Generation " + generations + ":");
            grid.printi();
            Thread.sleep(250);
            grid.makeBoard();
        }
    }
}

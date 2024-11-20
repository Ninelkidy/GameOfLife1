package org.example;

public class Main{
    public static void main(String[] args) throws InterruptedException{
       GridInterface grid = new Grid();

        for(int generations = 1; generations <= 55; generations++) {

            System.out.println("Generation " + generations + ":");
            grid.printi();
            Thread.sleep(500);
            grid.makeBoard();
        }}}

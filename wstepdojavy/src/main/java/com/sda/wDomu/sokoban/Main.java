package com.sda.wDomu.sokoban;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static void displayTable(int tab[][]) {
        for (int[] ints : tab) {
            for (int i = 0; i < tab[0].length; i++) {
                    System.out.print(" " + Symbol.getSymbolByNumber(ints[i]).getSymbolChar());
            }
           System.out.println();
        }
    }

    static void displayInfo(int level, int move, int goals ) {
        System.out.println("Level: "+level);
        System.out.println("Move: "+move+"");
        System.out.println("Goals: "+goals+"\n");
        System.out.println("Enter Q to quit");
        System.out.println("Enter backspace key to return");
        System.out.println("Enter W, A, S, D  to to move up, left, down and right, respectively");
    }

    public static void main(String[] args) {

        Board board = new Board(0);
        board.findPropertiesOfTable();

        char inputChar;
        Scanner scanner = new Scanner(System.in);


        do {
            displayTable(board.getLevelTab());
            displayInfo(board.getLevelNumber(), board.getNumberOfMoves(), board.getNumberOfGoals());

            inputChar = scanner.next().charAt(0);
            switch (inputChar) {
                case 'd':
                case 'D': {
                    board.moveRight();
                }
                break;
                case 'a':
                case 'A': {
                    board.moveLeft();
                }
                break;

                case 'w':
                case 'W': {
                    board.moveUp();
                }
                break;

                case 's':
                case 'S': {
                    board.moveDown();
                }
                break;
            }


            if (inputChar == 'R' || inputChar == 'r') {
                board.setLevelTabByLevel(board.getLevelNumber());
                board.findPropertiesOfTable();
            }

            if (board.getNumberOfGoals() == 0) {
                displayTable(board.getLevelTab());
                displayInfo(board.getLevelNumber(), board.getNumberOfMoves(), board.getNumberOfGoals());
                TimeUnit.SECONDS.toSeconds(1);
                System.out.println("NEXT LEVEL");
                board.setLevelNumber(board.getLevelNumber() + 1);
                board.setLevelTabByLevel(board.getLevelNumber());
                board.findPropertiesOfTable();
            }

        }
        while (inputChar != 'Q' && inputChar != 'q');


    }


}

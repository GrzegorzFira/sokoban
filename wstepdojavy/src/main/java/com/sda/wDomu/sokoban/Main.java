package com.sda.wDomu.sokoban;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {

        Board board = new Board(0);
        board.findPropertiesOfTable();

        char inputChar;
        Scanner scanner = new Scanner(System.in);
        do {
            board.displayTable();
            board.displayInfo();

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

                case 'r':
                case 'R': {
                    board.setLevelTabByLevel(board.getLevelNumber());
                    board.findPropertiesOfTable();
                }
                break;
                default: {
                    System.out.println("Try again");
                }
            }

            if (board.getNumberOfGoals() == 0) {
                board.displayTable();
                board.displayInfo();
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

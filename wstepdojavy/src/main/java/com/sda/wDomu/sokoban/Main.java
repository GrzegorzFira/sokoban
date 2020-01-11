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
            DisplayTable.wyswietl(board.getLevelTab());
            DisplayInfo.wyswietl(board.getLevelNumber(), board.getNumberOfMoves(), board.getNumberOfGoals());

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
                DisplayTable.wyswietl(board.getLevelTab());
                DisplayInfo.wyswietl(board.getLevelNumber(), board.getNumberOfMoves(), board.getNumberOfGoals());
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

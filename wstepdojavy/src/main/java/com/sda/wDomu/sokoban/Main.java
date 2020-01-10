package com.sda.wDomu.sokoban;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {



    public static void main(String[] args) {

        Game game = new Game(0);
        game.findPropertiesOfTable();

        char inputChar;
        Scanner scanner = new Scanner(System.in);



        do{
            DisplayTable.wyswietl(game.getLevelTab());
            DisplayInfo.wyswietl(game.getLevelNumber(), game.getNumberOfMoves(), game.getNumberOfGoals());

            inputChar=scanner.next().charAt(0);
            game.move(inputChar);

            if(inputChar=='R'||inputChar=='r'){
                game.setLevelTabByLevel(game.getLevelNumber());
                game.findPropertiesOfTable();
            }

            if(game.getNumberOfGoals()==0){
                DisplayTable.wyswietl(game.getLevelTab());
                DisplayInfo.wyswietl(game.getLevelNumber(), game.getNumberOfMoves(), game.getNumberOfGoals());
                TimeUnit.SECONDS.toSeconds(1);
                System.out.println("NEXT LEVEL");
                game.setLevelNumber(game.getLevelNumber()+1);
                game.setLevelTabByLevel(game.getLevelNumber());
                game.findPropertiesOfTable();}

        }
        while (inputChar!='Q'&&inputChar!='q');



    }




}

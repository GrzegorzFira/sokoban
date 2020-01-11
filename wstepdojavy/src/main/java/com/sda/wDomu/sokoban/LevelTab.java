package com.sda.wDomu.sokoban;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class LevelTab {


     static int[][] getTableByLevel(int level){
/*        try {
           System.out.println(Files.readAllLines(Paths.get("Table.txt")));
        } catch (IOException e) {
           e.printStackTrace();
        }

        String string=Files.readAllLines(Paths.get("Table.txt"));

        int [][][] listOfTables={};

        for(int i =0; i<1;i++){}*/


        if(0<=level&&level<listOfTables.length) return listOfTables[level];
        else return listOfTables[0];
    }

    private static  int[][] level00 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 4, 0, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 3, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 2, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 1, 1, 0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};

    private static final int[][] level01 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 0, 1, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 0, 0, 2, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 2, 1, 1},
            {1, 0, 3, 0, 1, 1, 1, 2, 1, 1},
            {1, 0, 3, 3, 1, 1, 1, 1, 1, 1},
            {1, 4, 0, 0, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};

    private static final int[][] level02 = {
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 1, 0, 3, 0, 4, 0, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 0, 1, 1},
            {1, 0, 3, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 1, 3, 1, 1, 0, 1, 1},
            {1, 2, 2, 3, 0, 0, 1, 0, 0, 1},
            {1, 2, 2, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};
    private static final int[][] level03 = {
            {1, 1, 1, 1, 1, 1},
            {1, 2, 2, 5, 2, 1},
            {1, 2, 3, 0, 0, 1},
            {1, 1, 0, 3, 0, 1},
            {1, 1, 3, 0, 1, 1},
            {1, 4, 3, 0, 1, 1},
            {1, 1, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 1},};
    private static final int[][] level04 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1},};


    private static final int[][] level09 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

    private static int [][][] listOfTables= {level00, level01, level02, level03, level04, level09};

}

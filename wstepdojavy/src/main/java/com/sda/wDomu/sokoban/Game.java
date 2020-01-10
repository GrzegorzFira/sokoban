package com.sda.wDomu.sokoban;

class Game {

    private int levelNumber;
    private int[][] levelTab;
    private int row;
    private int column;
    private int numberOfGoals;
    private int numberOfMoves;

     int getLevelNumber() {
        return levelNumber;
    }

    int getNumberOfGoals() {
        return numberOfGoals;
    }

     int getNumberOfMoves() {
        return numberOfMoves;
    }

     void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

     void setLevelTabByLevel(int levelNumber) {
        this.levelTab = LevelTab.getTableByLevel(levelNumber);
    }

     Game(int levelNumber) {
        this.levelNumber = levelNumber;
        this.levelTab = LevelTab.getTableByLevel(levelNumber);
        this.numberOfMoves = 0;
    }

     int[][] getLevelTab() {
        return levelTab;
    }



     void findPropertiesOfTable() {
        int number = 0;
        for (int i = 0; i < levelTab.length; i++) {
            for (int j = 0; j <levelTab[0].length ; j++) {
                if (levelTab[i][j] == 4) {
                    this.row =i;
                    this.column =j;
                                      }
                if (levelTab[i][j] == 2) {
                    number--;
                }
            }
        }
this.numberOfGoals = number;
        }

     void move(char inputChar) {
        levelTab[row][column]-=4;

                switch (inputChar) {
            case 'd':
            case 'D': {
                if (levelTab[row][column + 1] == 0 || levelTab[row][column + 1] == 2) {
                    column++;numberOfMoves++;
                } else if ((levelTab[row][column + 1] == 3 || levelTab[row][column + 1] == 5) && (levelTab[row][column + 2] == 0 || levelTab[row][column + 2] == 2)) {

                    levelTab[row][column + 1] -= 3;
                    if (levelTab[row][column + 1] == 2) {numberOfGoals--;}
                    levelTab[row][column + 2] += 3;
                    if (levelTab[row][column + 2] == 5) {numberOfGoals++;}
                    column++;numberOfMoves++;
                }
            }
            break;

            case 'a':
            case 'A': {
                if (levelTab[row][column - 1] == 0 || levelTab[row][column - 1] == 2) {
                    column--;numberOfMoves++;
                } else if ((levelTab[row][column - 1] == 3 || levelTab[row][column - 1] == 5) && (levelTab[row][column - 2] == 0 || levelTab[row][column - 2] == 2)) {

                    levelTab[row][column - 1] -= 3;
                    if (levelTab[row][column - 1] == 2) {numberOfGoals--;}
                    levelTab[row][column - 2] += 3;
                    if (levelTab[row][column - 2] == 5) {numberOfGoals++;}
                    column--;numberOfMoves++;
                }
            }
            break;

            case 'w':
            case 'W': {
                if (levelTab[row - 1][column] == 0 || levelTab[row - 1][column] == 2) {
                    row--;numberOfMoves++;
                } else if ((levelTab[row - 1][column] == 3 || levelTab[row - 1][column] == 5) && (levelTab[row - 2][column] == 0 || levelTab[row - 2][column] == 2)) {

                    levelTab[row - 1][column] -= 3;
                    if (levelTab[row - 1][column] == 2) {numberOfGoals--;}
                    levelTab[row - 2][column] += 3;
                    if (levelTab[row - 2][column] == 5) {numberOfGoals++;}
                    row--;numberOfMoves++;
                }
            }
            break;

            case 's':
            case 'S': {
                if (levelTab[row + 1][column] == 0 || levelTab[row + 1][column] == 2) {
                    row++;numberOfMoves++;
                } else if ((levelTab[row + 1][column] == 3 || levelTab[row + 1][column] == 5) && (levelTab[row + 2][column] == 0 || levelTab[row + 2][column] == 2)) {

                    levelTab[row + 1][column] -= 3;
                    if (levelTab[row + 1][column] == 2) {numberOfGoals--;}
                    levelTab[row + 2][column] += 3;
                    if (levelTab[row + 2][column] == 5) {numberOfGoals++;}
                    row++;numberOfMoves++;
                }
            }
            break;

        }

        System.out.println("You are row: "+ row +" column: "+ column +" ");
        levelTab[row][column]+=4;


    }

}
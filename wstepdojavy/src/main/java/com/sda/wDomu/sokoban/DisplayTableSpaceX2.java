package com.sda.wDomu.sokoban;


public class DisplayTableSpaceX2 {
    //    char frame_top = '-';
//    char frame_side = '|';
    private char frame_top = ' ';
    private char frame_side = ' ';

    public void wyswietl(int tab[][]) {
        int wide = tab[0].length;
        int height = tab.length;
        for (int j = 0; j <= 2 * height; j++) {
            for (int i = 0; i <= 4 * wide; i++) {
                if (j % 2 == 0) {
                    if (i % 2 == 0) {
                        System.out.print(frame_top);
                    } else {
                        System.out.print(" ");
                    }
                } else if (i % 4 == 0 ) {
                    System.out.print(frame_side);
                } else if (i % 2 == 1) {
                    System.out.print(" ");
                } else System.out.print(Symbols.getSymbolByNumber(tab[(j - 1) / 2][(i - 1) / 4]));
            }
            System.out.println();
        }

    }
}



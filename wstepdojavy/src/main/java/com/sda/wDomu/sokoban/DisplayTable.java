package com.sda.wDomu.sokoban;


 class DisplayTable {


     static void wyswietl(int tab[][]) {
         for (int[] ints : tab) {
             for (int i = 0; i < tab[0].length; i++) {
                 System.out.print(" " + Symbols.getSymbolByNumber(ints[i]));
             }
             System.out.println();
         }

    }
}



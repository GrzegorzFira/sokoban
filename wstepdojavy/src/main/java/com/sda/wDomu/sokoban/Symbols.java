package com.sda.wDomu.sokoban;

public enum Symbols {
    EMPTY(0, ' '),
    WALL(1, 'X'),
    DESTINATION(2, '·'),
    ITEM(3, 'O'),
    PLAYER(4, '۞'),
    ITEM_AT_DESTINATION(5, 'ʘ'),
    PLATER_AT_DESTINATION(6, '۞');

    private int symbolNumber;
    private char symbolChar;

    Symbols(int symbolNumber, char symbolChar) {
        this.symbolNumber = symbolNumber;
        this.symbolChar = symbolChar;
    }

    public char getSymbolChar() {
        return symbolChar;
    }


    public static char getSymbolByNumber(int number) {
        char c = '?';
        for (Symbols symbols : Symbols.values()) {
            if (symbols.symbolNumber == number) {
                c = symbols.symbolChar;
            }
        }
        return c;
    }


}

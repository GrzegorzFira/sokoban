package com.sda.wDomu.sokoban;

public enum Symbol {
    EMPTY( ' '),
    WALL( 'X'),
    DESTINATION( '·'),
    ITEM( 'O'),
    PLAYER( '۞'),
    ITEM_AT_DESTINATION( 'ʘ'),
    PLATER_AT_DESTINATION( '۞');


    private char symbolChar;

    Symbol(char symbolChar) {
        this.symbolChar = symbolChar;
    }

    public static char getSymbolByNumber(int number) {
        char c = '?';
        for (Symbol symbols : Symbol.values()) {
            if (symbols.ordinal() == number) {
                c = symbols.symbolChar;
            }
        }
        return c;
    }


}

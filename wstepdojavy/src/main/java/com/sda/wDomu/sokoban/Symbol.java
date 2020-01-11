package com.sda.wDomu.sokoban;

public enum Symbol {
    EMPTY( ' '),
    WALL( 'X'),
    DESTINATION( '·'),
    ITEM( 'O'),
    PLAYER( '۞'),
    ITEM_AT_DESTINATION( 'ʘ'),
    PLATER_AT_DESTINATION( '۞');

    private final char symbolChar;

    Symbol(char symbolChar) {
        this.symbolChar = symbolChar;
    }

    public static Symbol getSymbolByNumber(int number) {
        return values()[number];
    }

    public char getSymbolChar() {
        return symbolChar;
    }
}

package com.sda.wDomu.sokoban;

public enum Symbols {
    EMPTY( ' '),
    WALL( 'X'),
    DESTINATION( '·'),
    ITEM( 'O'),
    PLAYER( '۞'),
    ITEM_AT_DESTINATION( 'ʘ'),
    PLATER_AT_DESTINATION( '۞');


    private char symbolChar;

    Symbols( char symbolChar) {
        this.symbolChar = symbolChar;
    }

    public static char getSymbolByNumber(int number) {
        char c = '?';
        for (Symbols symbols : Symbols.values()) {
            if (symbols.ordinal() == number) {
                c = symbols.symbolChar;
            }
        }
        return c;
    }


}

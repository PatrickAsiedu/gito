package org.turntabl.io;

public enum Level {
    JUNIOR('1'), MID('2'),SENIOR('3');


    private final char symbol;

    Level(char symbol) {
        this.symbol = symbol;
    }
}

package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Color;

abstract public class Character {

    private int row;
    private int col;

    public Character(int col, int row) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

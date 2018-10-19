package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.bootcamp.grid.Representable;

abstract public class Unit implements Representable {

    private int col;
    private int row;

    public Unit(int col, int row) {
        this.col = col;
        this.row = row;
    }

    /** getters */
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

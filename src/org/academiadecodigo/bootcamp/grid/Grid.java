package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;

abstract public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private int rows;
    private int cols;
    private Unit[][] units;

    public Grid(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
        units = new Unit[cols][rows];
    }

    /** getters */
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Unit getUnit(int col, int row) {
        return units[col][row];
    }

    public Unit[][] getUnits() {
        return units;
    }
}

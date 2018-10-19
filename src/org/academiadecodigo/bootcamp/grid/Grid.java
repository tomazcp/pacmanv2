package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.Wall;

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

    public void init() {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                units[col][row] = new Wall(col, row, CELL_SIZE);
                units[col][row].draw();
            }
        }
    }

    /** getters */
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Unit getUnit() {
        return null;
    }

    public Unit[][] getUnits() {
        return null;
    }
}

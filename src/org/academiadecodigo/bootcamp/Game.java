package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Cell;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;

public class Game {

    private Unit[][] units;
    private Grid grid;

    public Game(Grid grid) {
        this.grid = grid;
        units = grid.getUnits();
    }

    public void init() {
        grid.init();

    }

    public void loadLevel(String level) {
        char[] levelArr = level.toCharArray();
        int idx = 0;
        for (int col = 0; col < grid.getCols(); col++) {
            for (int row = 0; row < grid.getRows(); row++) {
                if (levelArr[idx] == '1') {
                    units[col][row] = new Wall(col, row);
                }

                if (levelArr[idx] == '0') {
                    units[col][row] = new Cell(col, row);
                }
                idx++;
            }
        }
    }
}

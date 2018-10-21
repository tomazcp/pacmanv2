package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.sgfxgrid.GfxGrid;

public class Playground {

    public static void main(String[] args) {
        Grid grid = new GfxGrid(21, 21);

        Game game = new Game(grid);

        game.init();
        game.start();
    }
}

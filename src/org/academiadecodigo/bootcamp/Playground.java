package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.sgfxgrid.GfxGrid;

public class Playground {

    public static void main(String[] args) {
        Grid grid = new GfxGrid(15, 15);
        grid.init();
    }
}

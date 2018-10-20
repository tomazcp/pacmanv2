package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.sgfxgrid.GfxGrid;
import org.academiadecodigo.bootcamp.mapbuilder.LevelReader;

public class Playground {

    private static final String[] LEVELS = {"level_02"};

    public static void main(String[] args) {
        Grid grid = new GfxGrid(21, 21);

        Game game = new Game(grid);
        LevelReader levelReader = new LevelReader();
        game.loadLevel(levelReader.read(LEVELS[0]));

        game.init();
        game.start();
    }
}

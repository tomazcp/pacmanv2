package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.sgfxgrid.GfxGrid;
import org.academiadecodigo.bootcamp.mapbuilder.LevelReader;

public class Playground {

    public static void main(String[] args) {
        Grid grid = new GfxGrid(21, 21);

        Game game = new Game(grid);
        LevelReader levelReader = new LevelReader();
        game.loadLevel(levelReader.read("level_01"));

        game.init();
        game.start();
    }
}

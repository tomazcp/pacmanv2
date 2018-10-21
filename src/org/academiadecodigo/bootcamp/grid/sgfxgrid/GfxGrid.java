package org.academiadecodigo.bootcamp.grid.sgfxgrid;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxGrid extends Grid {

    private static final String BACKGROUND = "resources/background.png";

    private Picture background;

    public GfxGrid(int cols, int rows) {
        super(cols, rows);
        background = new Picture(Grid.PADDING, Grid.PADDING, BACKGROUND);
        background.draw();
    }
}

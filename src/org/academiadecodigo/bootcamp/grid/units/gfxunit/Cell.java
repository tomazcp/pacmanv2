package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cell extends GfxUnit {

    private static final Color COLOR = Color.BLACK;

    public Cell(int col, int row) {
        super(col, row);
        setColor(COLOR);
    }
}

package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Dot extends GfxUnit {

    private static final Color COLOR = Color.GREEN;

    public Dot(int col, int row, int size) {
        super(col, row);
        setColor(COLOR);
    }
}

package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Wall extends GfxUnit {

    private static final Color COLOR = Color.BLUE;

    public Wall(int col, int row) {
        super(col, row);
        setColor(COLOR);
        super.fill();
    }
}

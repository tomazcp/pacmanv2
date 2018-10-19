package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Wall extends Unit {

    private static final Color COLOR = Color.BLUE;

    public Wall(int col, int row, int size) {
        super(col, row, size);
        draw();
        setColor(COLOR);
    }


}

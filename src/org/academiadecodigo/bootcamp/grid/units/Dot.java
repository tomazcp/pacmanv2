package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Dot extends Unit {

    private static final Color COLOR = Color.GREEN;

    public Dot(int col, int row, int size) {
        super(col, row, size);
        draw();
        setColor(COLOR);
    }
}

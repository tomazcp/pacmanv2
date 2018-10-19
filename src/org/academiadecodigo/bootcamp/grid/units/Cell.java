package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cell extends Unit {

    private static final Color COLOR = Color.BLACK;

    public Cell(int col, int row, int size) {
        super(col, row, size);
        setColor(COLOR);
        draw();
    }
}

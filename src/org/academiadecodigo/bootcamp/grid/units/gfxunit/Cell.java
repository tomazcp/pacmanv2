package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell extends Unit {

    private static final Color COLOR = Color.BLACK;
    private Rectangle rectangle;

    public Cell(int col, int row) {
        super(col, row);
        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
                Grid.CELL_SIZE, Grid.CELL_SIZE);
        setColor(COLOR);
    }

    public void show() {
        rectangle.draw();
    }

    public void fill() {
        rectangle.fill();
    }

    public void setColor(Color color) {
        rectangle.setColor(color);
    }
}

package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Dot extends Unit implements Destroyable {

    private static final Color COLOR = Color.GREEN;
    private boolean isDestroyed = false;
    private Rectangle rectangle;

    public Dot(int col, int row) {
        super(col, row);
        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
                Grid.CELL_SIZE, Grid.CELL_SIZE);
        setColor(COLOR);
        fill();
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
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

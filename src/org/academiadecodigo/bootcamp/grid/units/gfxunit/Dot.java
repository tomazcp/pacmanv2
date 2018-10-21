package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dot extends Unit implements Destroyable {

    private static final String IMAGE = "resources/point.png";

    private static final Color COLOR = Color.GREEN;
    private boolean isDestroyed = false;
    //private Rectangle rectangle;
    private Picture image;

    public Dot(int col, int row) {
        super(col, row);
//        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
//                Grid.CELL_SIZE, Grid.CELL_SIZE);
        image = new Picture(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE
                + Grid.PADDING, IMAGE);
        //setColor(COLOR);
        //fill();
        show();
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
        image.delete();
    }

    public void show() {
        //rectangle.draw();
        image.draw();
    }

    public void fill() {
//        rectangle.fill();
    }

    public void setColor(Color color) {
        //rectangle.setColor(color);
    }
}

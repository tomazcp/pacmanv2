package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.simplegraphics.graphics.Color;
//import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Wall extends Unit {

    private static final String IMAGE_FILE = "resources/wall.png";

    private static final Color COLOR = Color.BLUE;
    private Picture image;

    public Wall(int col, int row) {
        super(col, row);
        image = new Picture(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
                IMAGE_FILE);
        setColor(COLOR);
        //fill();
        show();
    }

    public void show() {
        image.draw();
    }

    public void fill() {
    }

    public void setColor(Color color) {
    }
}

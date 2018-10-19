package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

abstract public class Unit implements Representable {

    private int col;
    private int row;
    private Color color;
    private Rectangle rectangle;

    Unit(int col, int row, int size) {
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(col * size + Grid.PADDING,
                row * size + Grid.PADDING, size, size);
    }

    /**
     * Fills rectangle with a color
     */
    public void fill() {
        rectangle.fill();
    }

    /**
     * Draws rectangle
     */
    public void draw() {
        rectangle.draw();
    }

    /** getters */
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getX() {
        return rectangle.getX();
    }

    public int getY() {
        return rectangle.getY();
    }

    /** setters */
    public void setColor(Color color) {
        this.color = color;
    }
}

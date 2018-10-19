package org.academiadecodigo.bootcamp.characters;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Destroyable;
import org.academiadecodigo.bootcamp.grid.units.Representable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PacMan extends Character implements Representable, Destroyable, Moveable {

    private static final Color COLOR = Color.YELLOW;

    private Rectangle rectangle;
    private boolean isDestroyed = false;

    public PacMan(int col, int row) {
        super(col, row);
        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING, +
                Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.setColor(COLOR);
        show();
    }

    public void show() {
        rectangle.draw();
        rectangle.fill();
    }

    public void moveUp(int dist) {
        int yPos = rectangle.getY() - dist * Grid.CELL_SIZE;
        rectangle.translate(0, yPos - rectangle.getY());
    }

    public void moveDown(int dist) {
        int yPos = rectangle.getY() + dist * Grid.CELL_SIZE;
        rectangle.translate(0, yPos - rectangle.getY());
    }

    public void moveRight(int dist) {
        int xPos = rectangle.getX() + dist * Grid.CELL_SIZE;
        rectangle.translate(xPos - rectangle.getX(), 0);
    }

    public void moveLeft(int dist) {
        int xPos = rectangle.getX() - dist * Grid.CELL_SIZE;
        rectangle.translate(xPos - rectangle.getX(), 0);
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
    }

    public void setColor(Color color) {
        rectangle.setColor(color);
    }
}

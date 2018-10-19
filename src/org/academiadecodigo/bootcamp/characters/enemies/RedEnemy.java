package org.academiadecodigo.bootcamp.characters.enemies;

import org.academiadecodigo.bootcamp.Destroyable;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class RedEnemy extends Enemy implements Destroyable {

    private static final Color COLOR = Color.RED;

    private Rectangle rectangle;
    private boolean isDestroyed = false;

    public RedEnemy(int col, int row) {
        super(col, row);
        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
                Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.setColor(COLOR);
        show();
    }

    public void show() {
        rectangle.draw();
        rectangle.fill();
    }

    public void setColor(Color color) {
        rectangle.setColor(color);
    }

    public void moveUp(int dist) {

    }

    public void moveDown(int dist) {

    }

    public void moveRight(int dist) {

    }

    public void moveLeft(int dist) {

    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
    }
}

package org.academiadecodigo.bootcamp.game.characters;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PacMan extends GameCharacter implements Destroyable {

    private static final Color COLOR = Color.YELLOW;
    public static final int SPEED = 1;

    private Rectangle rectangle;
    private boolean isDestroyed = false;
    private GridDirection currentDirection = GridDirection.STATIC;


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

    public void move() {
        super.moveInDirection(currentDirection, SPEED);

        int xPos = getCol() * Grid.CELL_SIZE + Grid.PADDING;
        int yPos = getRow() * Grid.CELL_SIZE + Grid.PADDING;

        rectangle.translate(xPos - rectangle.getX(), yPos - rectangle.getY());
    }

    public void changeDirection(GridDirection direction) {
        currentDirection = direction;
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

package org.academiadecodigo.bootcamp.game.characters.enemies;

import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Blinky extends Enemy implements Destroyable {

    private static final String IMAGE = "resources/ghost-red.png";

    private static final Color COLOR = Color.RED;
    private static final int SPEED = 1;

    //private Rectangle rectangle;
    private Picture image;
    private boolean isDestroyed = false;

    public Blinky(int col, int row) {
        super(col, row);
//        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING,
//                row * Grid.CELL_SIZE + Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
//        rectangle.setColor(COLOR);
        image = new Picture(col * Grid.CELL_SIZE + Grid.PADDING,
                row * Grid.CELL_SIZE + Grid.PADDING, IMAGE);
        changeDirection(GridDirection.newDirection());
        show();
    }

    public void show() {
//        rectangle.draw();
//        rectangle.fill();
        image.draw();
    }

    public void move() {
        changeDirection(chooseDirection());
        moveInDirection(getCurrentDirection(), SPEED);

        int xPos = getCol() * Grid.CELL_SIZE + Grid.PADDING;
        int yPos = getRow() * Grid.CELL_SIZE + Grid.PADDING;

        //rectangle.translate(xPos - rectangle.getX(), yPos - rectangle.getY());
        image.translate(xPos - image.getX(), yPos - image.getY());
    }

    private GridDirection chooseDirection() {
        GridDirection direction = getCurrentDirection();
        if (!getCollisionDetector().isSafe(direction, getCol(), getRow())) {
            direction = GridDirection.newDirection();
            if (direction.equals(getCurrentDirection()) ||
                    !getCollisionDetector().isSafe(direction, getCol(), getRow())) {
                return chooseDirection();
            }
        }
        return direction;
    }

    public void setColor(Color color) {
        //rectangle.setColor(color);
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
    }
}

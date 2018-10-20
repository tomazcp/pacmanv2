package org.academiadecodigo.bootcamp.game.characters;

import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PacMan extends GameCharacter implements Destroyable {

    private static final Color COLOR = Color.MAGENTA;
    public static final int SPEED = 1;

    private Rectangle rectangle;
    private boolean isDestroyed = false;
    private CollisionDetector collisionDetector;

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
        if (!collisionDetector.isSafe(this)) {
            return;
        }
        moveInDirection(getCurrentDirection(), SPEED);

        int xPos = getCol() * Grid.CELL_SIZE + Grid.PADDING;
        int yPos = getRow() * Grid.CELL_SIZE + Grid.PADDING;

        rectangle.translate(xPos - rectangle.getX(), yPos - rectangle.getY());
    }

//    @Override
//    public void changeDirection(GridDirection direction) {
//        super.changeDirection(direction);
//    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
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

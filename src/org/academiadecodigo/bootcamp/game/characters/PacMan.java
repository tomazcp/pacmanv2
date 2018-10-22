package org.academiadecodigo.bootcamp.game.characters;

import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.game.Destroyable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PacMan extends GameCharacter implements Destroyable {

    private static final String IMAGE = "resources/2pacman.png";

    private static final Color COLOR = Color.MAGENTA;
    public static final int SPEED = 1;

    private Picture image;
    private boolean isDestroyed = false;
    private CollisionDetector collisionDetector;

    public PacMan(int col, int row) {
        super(col, row);
        image = new Picture(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING,
                IMAGE);
        show();
    }

    public void show() {
        image.draw();
    }

    public void move() {
        if (!collisionDetector.isSafe(getCurrentDirection(), getCol(), getRow())) {
            return;
        }
        moveInDirection(getCurrentDirection(), SPEED);
        collisionDetector.checkForPoint(this);
        int xPos = getCol() * Grid.CELL_SIZE + Grid.PADDING;
        int yPos = getRow() * Grid.CELL_SIZE + Grid.PADDING;

        image.translate(xPos - image.getX(), yPos - image.getY());
    }

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
    }
}

package org.academiadecodigo.bootcamp.game.characters;

import org.academiadecodigo.bootcamp.grid.Representable;
import org.academiadecodigo.bootcamp.game.Movable;
import org.academiadecodigo.bootcamp.grid.GridDirection;

abstract public class GameCharacter implements Representable, Movable {

    private int row;
    private int col;
    private GridDirection currentDirection = GridDirection.STATIC;

    public GameCharacter(int col, int row) {
        this.row = row;
        this.col = col;
    }

    abstract public void move();

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void changeDirection(GridDirection direction) {
        currentDirection = direction;
    }

    public boolean equals(GameCharacter gameCharacter) {
        return (row == gameCharacter.getRow()) &&
                (col == gameCharacter.getCol());
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void moveUp(int dist) {
        row -= dist;
    }

    public void moveDown(int dist) {
        row += dist;
    }

    public void moveRight(int dist) {
        col += dist;
    }

    public void moveLeft(int dist) {
        col -= dist;
    }

    public void moveInDirection(GridDirection direction, int distance) {
        switch (direction) {
            case UP:
                moveUp(distance);
                break;

            case DOWN:
                moveDown(distance);
                break;

            case LEFT:
                moveLeft(distance);
                break;

            case RIGHT:
                moveRight(distance);
                break;

            case STATIC:
                break;
        }
    }

    /** getters */
    public GridDirection getCurrentDirection() {
        return currentDirection;
    }
}

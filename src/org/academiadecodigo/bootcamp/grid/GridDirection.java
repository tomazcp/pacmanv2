package org.academiadecodigo.bootcamp.grid;


public enum GridDirection {
    UP, DOWN, LEFT, RIGHT, STATIC;


    /**
     * Calculates the opposite direction
     *
     * @return
     */
    public GridDirection getNewDirection() {
        GridDirection oppositeDirection = null;
        switch (this) {
            case UP:
                oppositeDirection = GridDirection.DOWN;
                break;

            case DOWN:
                oppositeDirection = GridDirection.UP;
                break;

            case LEFT:
                oppositeDirection = GridDirection.RIGHT;
                break;

            case RIGHT:
                oppositeDirection = GridDirection.LEFT;
                break;
        }
        return oppositeDirection;
    }

    public static GridDirection newDirection() {
        return GridDirection.values()[(int) Math.floor(Math.random() *
                GridDirection.values().length - 1)];
    }
}

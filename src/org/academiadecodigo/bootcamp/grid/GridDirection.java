package org.academiadecodigo.bootcamp.grid;


public enum GridDirection {
    UP, DOWN, LEFT, RIGHT, STATIC;


    /**
     * Calculates the opposite direction
     *
     * @return the opposite direction
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

    /**
     * New random direction
     *
     * @return
     */
    public static GridDirection newDirection() {
        int rand = (int) Math.floor(Math.random() * (GridDirection.values().length - 1));
        return GridDirection.values()[rand];
    }
}

package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.units.Unit;

public class PathFinder {

    private Unit[][] units;

    public PathFinder(Unit[][] units) {
        this.units = units;
    }

    public Path findPath(GridDirection direction, int col, int row) {
        Path path = null;
        int moves = 0;

        for (GridDirection dir : GridDirection.values()) {
            if (dir.equals(direction) || dir.equals(GridDirection.STATIC)) continue;

            if (dir.equals(GridDirection.RIGHT)) {

            }
        }

        return path;
    }

    //public int availableMoves(int col, int row) {
      //  int moves = 0;
        //while (units[++col][row])
    //}


    private class Path {
        private int moves;
        private GridDirection direction;

        Path(int moves, GridDirection direction) {
            this.moves = moves;
            this.direction = direction;
        }
    }
}

package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;
import org.academiadecodigo.bootcamp.game.characters.PacMan;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;

public class CollisionDetector {

    //private GameCharacter[] enemies;
    private Unit[][] units;
    private PacMan pacMan;

    CollisionDetector(GameCharacter[] enemies, PacMan pacMan, Grid grid) {
        //this.enemies = enemies;
        this.pacMan = pacMan;
        this.units = grid.getUnits();
    }

    CollisionDetector(PacMan pacMan, Grid grid) {
        this.pacMan = pacMan;
        this.units = grid.getUnits();
    }

//    public void check() {
//        for (GameCharacter gameCharacter : enemies) {
//            if (pacMan.equals(gameCharacter)) {
//                pacMan.die();
//                System.out.println("Pacman died");
//            }
//        }
//    }

    public boolean isSafe(GameCharacter gameCharacter) {
        boolean isSafeToMove = true;
        switch (gameCharacter.getCurrentDirection()) {
            case UP:
                if (units[gameCharacter.getCol()][gameCharacter.getRow() - 1] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case DOWN:
                if (units[gameCharacter.getCol()][gameCharacter.getRow() + 1] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case LEFT:
                if (units[gameCharacter.getCol() - 1][gameCharacter.getRow()] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case RIGHT:
                if (units[gameCharacter.getCol() + 1][gameCharacter.getRow()] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;
        }
        return isSafeToMove;
    }
}

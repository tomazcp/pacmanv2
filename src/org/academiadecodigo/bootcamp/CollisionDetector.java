package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;
import org.academiadecodigo.bootcamp.game.characters.PacMan;
import org.academiadecodigo.bootcamp.game.characters.enemies.Enemy;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;

public class CollisionDetector {

    private Enemy[] enemies;
    private Unit[][] units;

    CollisionDetector(Enemy[] enemies, Grid grid) {
        //this.enemies = enemies;
        //this.pacMan = pacMan;
        this.enemies = enemies;
        this.units = grid.getUnits();
    }

//    CollisionDetector(PacMan pacMan, Grid grid) {
//        this.pacMan = pacMan;
//        this.units = grid.getUnits();
//    }

    public void check(PacMan pacMan) {
        for (Enemy enemy : enemies) {
            if (pacMan.equals(enemy)) {
                pacMan.die();
                System.out.println("Pacman died");
            }
        }
    }

    public boolean isSafe(GameCharacter character) {
        boolean isSafeToMove = true;
        switch (character.getCurrentDirection()) {
            case UP:
                if (units[character.getCol()][character.getRow() - 1] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case DOWN:
                if (units[character.getCol()][character.getRow() + 1] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case LEFT:
                if (units[character.getCol() - 1][character.getRow()] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;

            case RIGHT:
                if (units[character.getCol() + 1][character.getRow()] instanceof Wall) {
                    isSafeToMove = false;
                }
                break;
        }
        return isSafeToMove;
    }
}

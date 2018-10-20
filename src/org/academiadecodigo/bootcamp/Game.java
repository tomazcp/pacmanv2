package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;
import org.academiadecodigo.bootcamp.game.characters.PacMan;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.game.characters.enemies.RedEnemy;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Cell;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Dot;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {

    private Unit[][] units;
    private Grid grid;
    private PacMan pacMan;
    private GameCharacter[] characters;
    private CollisionDetector collisionDetector;


    public Game(Grid grid) {
        this.grid = grid;
        units = grid.getUnits();
        //this.characters = new GameCharacter[1];
    }


    public void loadLevel(String level) {
        char[] levelArr = level.toCharArray();
        int idx = 0;
        for (int row = 0; row < grid.getRows(); row++) {
            for (int col = 0; col < grid.getCols(); col++) {
                if (levelArr[idx] == '1') {
                    units[col][row] = new Wall(col, row);
                }

                if (levelArr[idx] == '0') {
                    units[col][row] = new Cell(col, row);
                }

                if (levelArr[idx] == '2') {
                    units[col][row] = new Dot(col, row);
                }
                idx++;
            }
        }
        pacMan = new PacMan(2, 1);
        //characters[0] = new RedEnemy(2, 2);
        collisionDetector = new CollisionDetector(pacMan, grid);
        pacMan.setCollisionDetector(collisionDetector);
    }

    public void start() {
        try {
            while (!pacMan.isDestroyed()) {
                Thread.sleep(400);
                pacMan.move();
                //collisionDetector.check();
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("You died");
        }
    }

    public void init() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        // right
        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        // up
        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        // down
        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                pacMan.changeDirection(GridDirection.UP);
                break;

            case KeyboardEvent.KEY_DOWN:
                pacMan.changeDirection(GridDirection.DOWN);
                break;

            case KeyboardEvent.KEY_LEFT:
                pacMan.changeDirection(GridDirection.LEFT);
                break;

            case KeyboardEvent.KEY_RIGHT:
                pacMan.changeDirection(GridDirection.RIGHT);
                break;

            default:
                System.out.println("wtf are you even pressing?");
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

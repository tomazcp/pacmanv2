package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.characters.PacMan;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.units.Unit;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Cell;
import org.academiadecodigo.bootcamp.grid.units.gfxunit.Wall;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {

    private Unit[][] units;
    private Grid grid;
    private PacMan pacMan;


    public Game(Grid grid) {
        this.grid = grid;
        units = grid.getUnits();
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
                idx++;
            }
        }
        pacMan = new PacMan(2, 1);
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
                pacMan.moveUp(1);
                System.out.println("up");
                break;

            case KeyboardEvent.KEY_DOWN:
                pacMan.moveDown(1);
                System.out.println("down");
                break;

            case KeyboardEvent.KEY_LEFT:
                pacMan.moveLeft(1);
                System.out.println("left");
                break;

            case KeyboardEvent.KEY_RIGHT:
                pacMan.moveRight(1);
                System.out.println("right");
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

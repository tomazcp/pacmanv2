package org.academiadecodigo.bootcamp.characters.enemies;

import org.academiadecodigo.bootcamp.Movable;
import org.academiadecodigo.bootcamp.characters.GameCharacter;

abstract public class Enemy extends GameCharacter implements Movable {

    public Enemy(int col, int row) {
        super(col, row);
    }
}

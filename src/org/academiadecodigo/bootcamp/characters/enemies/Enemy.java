package org.academiadecodigo.bootcamp.characters.enemies;

import org.academiadecodigo.bootcamp.Movable;
import org.academiadecodigo.bootcamp.Representable;
import org.academiadecodigo.bootcamp.characters.GameCharacter;

abstract public class Enemy extends GameCharacter implements Movable, Representable {

    public Enemy(int col, int row) {
        super(col, row);
    }
}

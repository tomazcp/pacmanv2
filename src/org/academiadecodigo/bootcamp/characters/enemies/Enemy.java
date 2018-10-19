package org.academiadecodigo.bootcamp.characters.enemies;

import org.academiadecodigo.bootcamp.Movable;
import org.academiadecodigo.bootcamp.characters.GameCharacter;

abstract class Enemy extends GameCharacter {

    Enemy(int col, int row) {
        super(col, row);
    }
}

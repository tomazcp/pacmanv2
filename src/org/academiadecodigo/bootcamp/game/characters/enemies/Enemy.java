package org.academiadecodigo.bootcamp.game.characters.enemies;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;

abstract class Enemy extends GameCharacter {

    Enemy(int col, int row) {
        super(col, row);
    }
}

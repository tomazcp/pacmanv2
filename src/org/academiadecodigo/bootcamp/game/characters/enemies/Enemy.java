package org.academiadecodigo.bootcamp.game.characters.enemies;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;

public abstract class Enemy extends GameCharacter {

    public Enemy(int col, int row) {
        super(col, row);
    }

    public void move() {
        System.out.println("moving");
    }
}

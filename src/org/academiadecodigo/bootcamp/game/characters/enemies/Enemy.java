package org.academiadecodigo.bootcamp.game.characters.enemies;

import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.game.characters.GameCharacter;

public abstract class Enemy extends GameCharacter {

    private CollisionDetector collisionDetector;

    public Enemy(int col, int row) {
        super(col, row);
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }
}

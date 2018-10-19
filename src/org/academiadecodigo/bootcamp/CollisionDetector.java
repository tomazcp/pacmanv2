package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.characters.GameCharacter;
import org.academiadecodigo.bootcamp.game.characters.PacMan;

public class CollisionDetector {

    private GameCharacter[] gameCharacters;
    private PacMan pacMan;

    CollisionDetector(GameCharacter[] gameCharacters, PacMan pacMan) {
        this.gameCharacters = gameCharacters;
        this.pacMan = pacMan;
    }

    public void check() {
        for (GameCharacter gameCharacter : gameCharacters) {
            if (pacMan.equals(gameCharacter)) {
                pacMan.die();
                System.out.println("Pacman died");
            }
        }
    }
}

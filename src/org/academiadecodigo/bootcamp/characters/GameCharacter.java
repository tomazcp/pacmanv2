package org.academiadecodigo.bootcamp.characters;

import org.academiadecodigo.bootcamp.Representable;

abstract public class GameCharacter implements Representable {

    private int row;
    private int col;

    public GameCharacter(int col, int row) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean equals(GameCharacter gameCharacter) {
        return (row == gameCharacter.getRow()) &&
                (col == gameCharacter.getCol());
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

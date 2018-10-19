package org.academiadecodigo.bootcamp.grid.units;

import org.academiadecodigo.simplegraphics.graphics.Color;

public interface Representable {

    int getRow();

    int getCol();

    void draw();

    void fill();

    int getX();

    int getY();

    void setColor(Color color);
}

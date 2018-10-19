package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;

public interface Representable {

    int getRow();

    int getCol();

    void show();

    void setColor(Color color);
}

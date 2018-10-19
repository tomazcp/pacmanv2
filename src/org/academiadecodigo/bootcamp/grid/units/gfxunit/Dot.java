package org.academiadecodigo.bootcamp.grid.units.gfxunit;

import org.academiadecodigo.bootcamp.grid.units.Destroyable;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Dot extends GfxUnit implements Destroyable {

    private static final Color COLOR = Color.GREEN;
    private boolean isDestroyed = false;

    public Dot(int col, int row) {
        super(col, row);
        setColor(COLOR);
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void die() {
        isDestroyed = true;
    }
}

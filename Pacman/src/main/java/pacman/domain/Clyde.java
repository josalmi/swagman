/*
 * Pacman - Clyde
 * 30.12.2013
 * Copyright (c) 2013 Joni Salmi. All rights reserved.
 */
package pacman.domain;

import java.awt.Color;
import java.awt.Graphics;
import pacman.tile.Drawing;
import pacman.tile.Moving;

/**
 *
 * @author Joni
 */
public class Clyde extends AbstractMonster implements Moving, Drawing, Monster {

    public Clyde(int x, int y) {
        super(x, y, Direction.RIGHT, true);
        this.color = new Color(255, 184, 81);
    }

    @Override
    public void draw(Graphics g) {
        if (isChase()) {
            g.setColor(this.color);
        } else {
            g.setColor(new Color(0,0,255));
        }
        g.fillOval(x * 16 + (int) locationX, y * 16 + (int) locationY, 16, 16);
    }

}

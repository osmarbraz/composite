package com.composite.shapes;

import java.awt.*;

/**
 * Interface forma comum.
 */
public interface Shape {

    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    boolean isSelected();

    void paint(Graphics graphics);
}

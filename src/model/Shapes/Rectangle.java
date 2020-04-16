package model.Shapes;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
    }

    public Rectangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    public boolean contains(Point p) {
        int point_x = p.x;
        int point_y = p.y;

        return containsX(point_x) && containsY(point_y);
    }

    @Override
    void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}

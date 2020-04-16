package model.Shapes;

import sound.MidiSynth;

import java.awt.*;

public class Oval extends Shape {

    public Oval(Point topLeft, MidiSynth midiSynth) {
        this((int) topLeft.getX(), (int) topLeft.getY(), 0, 0); //note to students: calls the other constructor!
        selected = false;
        this.midiSynth = midiSynth;
        instrument = 41;
        playLineCoord = 0;
        PLAYING_COLOR = new Color(20, 100, 200);
    }

    public Oval(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    void drawGraphics(Graphics g) {
        g.drawOval(x, y, width, height);
    }

    @Override
        //EFFECTS: fills the shape
    void fillGraphics(Graphics g) {
        g.fillOval(x, y, width, height);
    }

    // EFFECTS: return true if this Oval contains the given point p, else return false
    @Override
    public boolean contains(Point p) {
        final double TOL = 1.0e-6;
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;
        double diff = 0.0;

        if (halfWidth > 0.0) {
            diff = diff + sqrDiff(x + halfWidth, p.x) / (halfWidth * halfWidth);
        } else {
            diff = diff + sqrDiff(x + halfWidth, p.x);
        }
        if (halfHeight > 0.0) {
            diff = diff + sqrDiff(y + halfHeight, p.y) / (halfHeight * halfHeight);
        } else {
            diff = diff + sqrDiff(y + halfHeight, p.y);
        }
        return diff <= 1.0 + TOL;
    }

    // Compute square of difference
    // EFFECTS: returns the square of the difference of num1 and num2
    private double sqrDiff(double num1, double num2) {
        return (num1 - num2) * (num1 - num2);
    }
}

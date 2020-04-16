package ui.tools.ShapeTools;

import model.Shapes.Rectangle;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class RectangleTool extends ShapeTool {

    public RectangleTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    @Override
    String getLabel() {
        return "Rectangle";
    }

    @Override
    void makeShape(MouseEvent e) {
        shape = new Rectangle(e.getPoint(), editor.getMidiSynth());

    }
}

package ui.tools.ShapeTools;

import model.Shapes.Oval;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class OvalTool extends ShapeTool {

    public OvalTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    @Override
    String getLabel() {
        return "Oval";
    }

    @Override
    void makeShape(MouseEvent e) {
        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
}

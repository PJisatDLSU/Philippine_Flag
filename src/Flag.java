import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Flag {
    private GPolygon top, bottom;
    private GLine middle;

    public Flag() {
        top = new GPolygon();
        bottom = new GPolygon();
        middle = new GLine(0, 0, 0, 0);
    }

    public void addToProgram(GraphicsProgram program) {
        program.add(top);
        program.add(bottom);
        program.add(middle);
    }

    public void adjustShapes(int width, int height) {
        middle.setStartPoint(width / 2.5, height / 2.0);
        middle.setEndPoint(width, height / 2.0);

        top.addVertex(0, 0);
        top.addVertex(width / 2.5, height / 2.0);
        top.addVertex(width, height / 2.0);
        top.addVertex(width, 0);
        top.setFilled(true);
        top.setFillColor(Color.BLUE);

        bottom.addVertex(0, height);
        bottom.addVertex(width / 2.5, height / 2.0);
        bottom.addVertex(width, height / 2.0);
        bottom.addVertex(width, height);
        bottom.setFilled(true);
        bottom.setFillColor(Color.RED);
    }
}

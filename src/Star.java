import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Star {
    private GPolygon star;

    public Star(double radius, int numPoints, double centerX, double centerY) {
        star = new GPolygon();
        double angleIncrement = 2 * Math.PI / numPoints;

        for (int i = 0; i < numPoints; i++) {
            double outerRadius = i % 2 == 0 ? radius : radius * 0.5;
            double x = centerX + outerRadius * Math.cos(i * angleIncrement);
            double y = centerY + outerRadius * Math.sin(i * angleIncrement);
            star.addVertex(x, y);
        }
        star.setFilled(true);
        star.setFillColor(Color.YELLOW);
    }

    public void addToProgram(GraphicsProgram program) {
        program.add(star);
    }
}

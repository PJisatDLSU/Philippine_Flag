import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Sun {
    private GOval sunBase;
    private GPolygon[] rays;
    private double initialAngle;

    public Sun(double centerX, double centerY, double radius, int numRays) {
        sunBase = new GOval(radius * 2, radius * 2);
        sunBase.setColor(Color.YELLOW);
        sunBase.setFilled(true);
        sunBase.setFillColor(Color.YELLOW);
        rays = new GPolygon[numRays];
        initialAngle = 0;

        for (int i = 0; i < numRays; i++) {
            rays[i] = createRay();
            rays[i].rotate((initialAngle + (i) * (360 / numRays)));
        }
    }

    private GPolygon createRay() {
        GPolygon ray = new GPolygon();
        ray.addVertex(0, -80);
        ray.addVertex(10, -65);
        ray.addVertex(5, -30);
        ray.addVertex(-5, 30);
        ray.addVertex(-10, -65);
        ray.setColor(Color.YELLOW);
        ray.setFilled(true);
        ray.setFillColor(Color.YELLOW);
        return ray;
    }

    public void addToProgram(GraphicsProgram program, double centerX, double centerY) {
        program.add(sunBase, centerX - sunBase.getWidth() / 2, centerY - sunBase.getHeight() / 2);
        for (GPolygon ray : rays) {
            program.add(ray, centerX, centerY);
        }
    }
}

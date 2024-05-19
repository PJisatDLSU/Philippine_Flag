import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Main extends GraphicsProgram {
    private Flag flag;
    private Star star1, star2, star3;
    private Sun sun;

    public void run() {
        flag = new Flag();
        flag.addToProgram(this);

        int width = getWidth();
        int height = getHeight();

        // Create and add the stars
        double radius = Math.min(width, height) * 0.05; // Use 5% of the smaller dimension as the radius
        star1 = new Star(radius, 10, width / 3.0, height / 2.0);
        star2 = new Star(radius, 10, width / 20.0, height / 6.0);
        star3 = new Star(radius, 10, width / 20.0, height / 1.2);
        star1.addToProgram(this);
        star2.addToProgram(this);
        star3.addToProgram(this);

        // Create and add the sun
        double circleX = (double) width / 7.5;
        double circleY = (double) height / 2;
        double circleSIZE = 30;
        sun = new Sun(circleX, circleY, circleSIZE, 7);
        sun.addToProgram(this, circleX, circleY);

        // Adjust shapes initially
        flag.adjustShapes(width, height);
    }

    public static void main(String[] args) {
        new Main().start(args);
    }
}

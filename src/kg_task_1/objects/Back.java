package kg_task_1.objects;

import java.awt.*;

public class Back {
    private int width;
    private int height;

    public Back(int width, int height) {

        this.width = width;
        this.height = height;
    }
    public void draw(Graphics2D g) {
        g.setPaint(new LinearGradientPaint(width / 2, 0, width / 2, height,
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(63, 100, 213), new Color(125, 180, 229)}));
        g.fillRect(0, 0, width, height);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(200, 80, 120, 20);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(400, 100, 230, 27);

        g.setColor(Color.white);
        g.fillOval(310, 20, 80, 20);

        g.setColor(Color.white);
        g.fillOval(10, 30, 200, 60);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(900, 50, 200, 30);

        g.setColor(Color.white);
        g.fillOval(500, 10, 400, 60);

        g.setColor(Color.white);
        g.fillOval(800, 90, 120, 20);


    }
}

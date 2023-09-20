package kg_task_1.objects;

import java.awt.*;

public class Back {
    public void draw(Graphics2D g, int width, int height) {
        g.setPaint(new LinearGradientPaint(width / 2, 0, width / 2, height,
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(38, 65, 173), new Color(107, 181, 239)}));
        g.fillRect(0, 0, width, height);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(200, 80, 120, 20);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(400, 100, 230, 27);

        g.setColor(Color.white);
        g.fillOval(10, 30, 200, 50);

        g.setPaint(new Color(114, 123, 141));
        g.fillOval(900, 50, 200, 30);

        g.setColor(Color.white);
        g.fillOval(500, 10, 400, 60);

        g.setColor(Color.white);
        g.fillOval(800, 90, 120, 20);


    }
}

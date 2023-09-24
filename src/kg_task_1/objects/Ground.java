package kg_task_1.objects;

import java.awt.*;

public class Ground {
    public void draw(Graphics2D g, int width, int height) {
        g.setPaint(new Color(101, 57, 24));
        g.fillRect(0, 500, width, height);

        g.setPaint(new Color(15, 126, 25));
        g.fillRect(0, 500, width, 20);
    }
}
